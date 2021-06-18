<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/5/10
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>增加景点地域</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../../lib/layui-v2.5.5/css/layui.css" media="all">
    <link rel="stylesheet" href="../../css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">
        <blockquote class="layui-elem-quote layui-text">
            修改景点地域
        </blockquote>

        <div class="layui-form layuimini-form">
            <div class="layui-form-item">
                <label class="layui-form-label required">地域名称</label>
                <div class="layui-input-block">
                    <input type="text" name="areaname" id="areaname" lay-verify="required" lay-reqtext="景点地域名称不能为空" placeholder="请输入景点地域名称" value="" class="layui-input">
                    <tip>填写景点地域的名称。</tip>
                    <input type="hidden" id="areaid" name="areaid">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">地域状态</label>
                <div class="layui-input-block">
                    <select name="areastate" id="areastate">
                        <option value="0">不可用</option>
                        <option value="1" selected="">可用</option>
                    </select>
                    <tip>选择景点地域的状态。</tip>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">地域排序</label>
                <div class="layui-input-block">
                    <select name="areasort">
                        <c:forEach begin="1" end="9" step="1" var="sort">
                            <option value="${sort}">${sort}</option>
                        </c:forEach>
                    </select>
                    <tip>选择景点地域的排序，数字越小越靠前。</tip>
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="saveBtn">确认保存</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../../lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<script src="../../lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<script src="../../js/config.js"></script>
<script>

    //初始化页面方法
    var initpage = function(form){
        //获取url参数
        var id = Config.getUrlParam("id");
        console.log(id);
        //ajax调用初始化页面的数据接口，并对页面进行初始化
        $.ajax({
            url:"/initedit?id="+id,
            type:"get",
            success:function (rtn) {

                $("#areaid").val(rtn.areaid);
                $("#areaname").val(rtn.areaname);
                $("#areastate").val(rtn.areastate);
                $("#areasort").val(rtn.areasort);
                form.render();
            }
        })
    }

    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;
        initpage(form);
        //alert(Config.getUrlParam("id"));
        //监听提交
        form.on('submit(saveBtn)', function (data) {
            //console.log(data.field);
            $.ajax({
                url:"update",
                type:"post",
                data:data.field,
                success:function (rtn) {
                    if(rtn>0){
                        //layer.alert("保存成功");
                        window.location.href="list.jsp";
                    }else{
                        layer.alert("保存失败");
                    }
                }
            })
            return false;
        });
    });
</script>
</body>
</html>