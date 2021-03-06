<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>景点地域列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.5.5/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">
        <fieldset class="table-search-fieldset">
            <legend>搜索信息</legend>
            <div style="margin: 10px 10px 10px 10px">
                <div class="layui-form layuimini-form">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">地域名称</label>
                            <div class="layui-input-inline">
                                <input type="text" name="areaname" autocomplete="off" class="layui-input">
                            </div>
                        </div>

                        <div class="layui-inline">
                            <label class="layui-form-label">地域状态</label>
                            <div class="layui-input-inline">
                                <select name="areastate">
                                    <option value="-1">全部</option>
                                    <option value="0">不可用</option>
                                    <option value="1">可用</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <button type="submit" class="layui-btn layui-btn-primary" lay-submit  lay-filter="data-search-btn"><i class="layui-icon"></i> 搜 索</button>
                        </div>
                    </div>
                </div>
            </div>
        </fieldset>


            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm data-add-btn" onclick="location.href='${pageContext.request.contextPath}/test/toadd';"> 添加景点地域 </button>
                <!--<button class="layui-btn layui-btn-sm layui-btn-danger data-delete-btn"> 删除景点地域 </button>-->
            </div>
        <table >
            <thead>
            <tr>
                <th>ID</th>
                <th>地域名称</th>
                <th>地域状态</th>
                <th>排序</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="area">
                <tr>
                    <td>${area.areaid}</td>
                    <td>${area.areaname}</td>
                    <td><c:choose>
                        <c:when test="${area.areastate==1}">可用</c:when>
                        <c:otherwise>不可用</c:otherwise>
                    </c:choose>
                    </td>
                    <td>${area.areasort}</td>
                    <td>
        <%--<script type="text/html" id="currentTableBar">--%>
            <a class="layui-btn layui-btn-xs data-count-edit" lay-event="edit" href="${pageContext.request.contextPath}/sys/area/upload&id=${area.areaid}">编辑</a>
            <a class="layui-btn layui-btn-xs layui-btn-danger data-count-delete" lay-event="delete">删除</a>
       <%-- </script>--%>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script src="${pageContext.request.contextPath}/lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/js/config.js"></script>
<script>
    layui.use(['form', 'table'], function () {
        var $ = layui.jquery,
            form = layui.form,
            table = layui.table,
            layuimini = layui.layuimini;
        table.render({
            elem: '#currentTableId',
            url: '/sys/area/page1',
            toolbar: '#toolbarDemo',
            cols: [[
                {field: 'areaid', width: 180, title: 'ID', sort: true },
                {field: 'areaname', width: 180, title: '地域名称'},
                {field: 'areastate', width: 180, title: '地域状态', sort: true},
                {field: 'areasort', width: 180, title: '排序', sort:true},
                {title: '操作', minWidth: 50, templet: '#currentTableBar', fixed: "right", align: "center"}
            ]],
            limits: [10,20,50,100],
            limit: 10,
            page: true

        });
        // 监听搜索操作
        form.on('submit(data-search-btn)', function (data) {
            console.log(data);
            //执行搜索重载
            table.reload('currentTableId', {
                page: {
                    curr: 1
                }
                , where: {
                    //data.field
                    areaname:data.field.areaname,
                    areastate:data.field.areastate
                }
            }, 'data');

            return false;
        });
        // 监听添加操作
        $(".data-add-btn").on("click", function () {
            var index = layer.open({
                title: '添加景点地域',
                type: 2,
                shade: 0.2,
                maxmin: true,
                shadeClose: true,
                area: ['50%', '70%'],
                content: 'add.html',
                end: function () { //关闭后刷新表格
                    table.reload('currentTableId', {
                        page: {curr: 1}
                    }, 'data');
                }
            });
            $(window).on("resize", function () {
                layer.full(index);
            });

            return false;
        });
            table.on('tool(currentTableFilter)', function (obj) {
                var data = obj.data;
                if (obj.event === 'edit') {
                    window.location.href = "edit.html?id="+data.areaid;
                    // var index = layer.open({
                    //     title: '编辑用户',
                    //     type: 2,
                    //     shade: 0.2,
                    //     maxmin:true,
                    //     shadeClose: true,
                    //     area: ['50%', '70%'],
                    //     content: 'edit.html?id='+data.areaid,
                    // });
                    // $(window).on("resize", function () {
                    //     layer.full(index);
                    // });
                    return false;
                } else if (obj.event === 'delete') {
                    layer.confirm('真的删除行么', function (index) {
                        obj.del();
                        layer.close(index);
                    });
                }
            });
    });
</script>
</body>
</html>