<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>增加酒店类型</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui-v2.5.5/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css" media="all">
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">
        <blockquote class="layui-elem-quote layui-text">
            !${msg}
        </blockquote>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>增加酒店类型</legend>
        </fieldset>

        <form class="layui-form" action="${pageContext.request.contextPath}/sys/hoteltype/add" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">酒店类型名称</label>
                <div class="layui-input-block">
                    <input type="text" name="htname" lay-verify="required" lay-reqtext="酒店类型名称是必填项，岂能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">酒店类型状态</label>
                <div class="layui-input-block">
                    <select name="htstate">
                        <option value="1">可用</option>
                        <option value="0">不可用</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">排序</label>
                <div class="layui-input-block">
                    <select name="htsort">
                        <c:forEach begin="1" end="9" step="1" var="sort">
                            <option value="${sort}">${sort}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <input type="submit" class="layui-btn" value="提交"></input>
                    <input type="button" class="layui-btn layui-btn-primary"
                    onclick="window.location.href='${pageContext.request.contextPath}/sys/hoteltype/list.html';" value="返回"></input>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script src="/lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
            var form = layui.form
                , layer = layui.layer
                , layedit = layui.layedit
                , laydate = layui.laydate;
        });
</script>
</html>
