/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-06 13:27:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dshow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <!-- 页面meta -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>数据 - AdminLTE2定制版</title>\n");
      out.write("    <meta name=\"description\" content=\"AdminLTE2定制版\">\n");
      out.write("    <meta name=\"keywords\" content=\"AdminLTE2定制版\">\n");
      out.write("\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta\n");
      out.write("            content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"\n");
      out.write("            name=\"viewport\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionicons/css/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/iCheck/square/blue.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/morris/morris.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/datepicker/datepicker3.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/datatables/dataTables.bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/treeTable/jquery.treetable.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/treeTable/jquery.treetable.theme.default.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/select2/select2.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/colorpicker/bootstrap-colorpicker.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/AdminLTE.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/skins/_all-skins.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionslider/ion.rangeSlider.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionslider/ion.rangeSlider.skinNice.css\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-slider/slider.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- 页面头部 -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- 页面头部 /-->\n");
      out.write("\n");
      out.write("    <!-- 导航侧栏 -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "aside.jsp", out, false);
      out.write("\n");
      out.write("    <!-- 导航侧栏 /-->\n");
      out.write("\n");
      out.write("    <!-- 内容区域 -->\n");
      out.write("    <div class=\"content-wrapper\">\n");
      out.write("\n");
      out.write("        <!-- 内容头部 -->\n");
      out.write("        <section class=\"content-header\">\n");
      out.write("            <h1>\n");
      out.write("                用户管理\n");
      out.write("                <small>全部用户</small>\n");
      out.write("            </h1>\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.jsp\"><i\n");
      out.write("                        class=\"fa fa-dashboard\"></i> 首页</a></li>\n");
      out.write("                <li><a\n");
      out.write("                        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll.do\">用户管理</a></li>\n");
      out.write("\n");
      out.write("                <li class=\"active\">全部用户</li>\n");
      out.write("            </ol>\n");
      out.write("        </section>\n");
      out.write("        <!-- 内容头部 /-->\n");
      out.write("\n");
      out.write("        <!-- 正文区域 -->\n");
      out.write("        <section class=\"content\"> <!-- .box-body -->\n");
      out.write("            <div class=\"box box-primary\">\n");
      out.write("                <div class=\"box-header with-border\">\n");
      out.write("                    <h3 class=\"box-title\">列表</h3>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box-body\">\n");
      out.write("\n");
      out.write("                    <!-- 数据表格 -->\n");
      out.write("                    <div class=\"table-box\">\n");
      out.write("\n");
      out.write("                        <!--工具栏-->\n");
      out.write("                        <div class=\"pull-left\">\n");
      out.write("                            <div class=\"form-group form-inline\">\n");
      out.write("                                <div class=\"btn-group\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" title=\"新建\">\n");
      out.write("                                        <i class=\"fa fa-file-o\"></i> 新建\n");
      out.write("                                    </button>\n");
      out.write("\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" title=\"刷新\">\n");
      out.write("                                        <i class=\"fa fa-refresh\"></i> 刷新\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box-tools pull-right\">\n");
      out.write("                            <div class=\"has-feedback\">\n");
      out.write("                                <input type=\"text\" class=\"form-control input-sm\"\n");
      out.write("                                       placeholder=\"搜索\"> <span\n");
      out.write("                                    class=\"glyphicon glyphicon-search form-control-feedback\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--工具栏/-->\n");
      out.write("\n");
      out.write("                        <!--数据列表-->\n");
      out.write("                        <div class=\"tab-pane\" id=\"tab-treetable\">\n");
      out.write("                            <table id=\"collapse-table\"\n");
      out.write("                                   class=\"table table-bordered table-hover dataTable\">\n");
      out.write("                                <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>名称</th>\n");
      out.write("                                    <th>描述</th>\n");
      out.write("                                </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tr data-tt-id=\"0\">\n");
      out.write("                                    <td colspan=\"2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!--数据列表/-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- 数据表格 /-->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.box-body -->\n");
      out.write("\n");
      out.write("                <!-- .box-footer-->\n");
      out.write("                <div class=\"box-footer\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <div class=\"form-group form-inline\">\n");
      out.write("                            总共2 页，共14 条数据。 每页 <select class=\"form-control\">\n");
      out.write("                            <option>1</option>\n");
      out.write("                            <option>2</option>\n");
      out.write("                            <option>3</option>\n");
      out.write("                            <option>4</option>\n");
      out.write("                            <option>5</option>\n");
      out.write("                        </select> 条\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"box-tools pull-right\">\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            <li><a href=\"#\" aria-label=\"Previous\">首页</a></li>\n");
      out.write("                            <li><a href=\"#\">上一页</a></li>\n");
      out.write("                            <li><a href=\"#\">1</a></li>\n");
      out.write("                            <li><a href=\"#\">2</a></li>\n");
      out.write("                            <li><a href=\"#\">3</a></li>\n");
      out.write("                            <li><a href=\"#\">4</a></li>\n");
      out.write("                            <li><a href=\"#\">5</a></li>\n");
      out.write("                            <li><a href=\"#\">下一页</a></li>\n");
      out.write("                            <li><a href=\"#\" aria-label=\"Next\">尾页</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.box-footer-->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- 正文区域 /-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- @@close -->\n");
      out.write("    <!-- 内容区域 /-->\n");
      out.write("\n");
      out.write("    <!-- 底部导航 -->\n");
      out.write("    <footer class=\"main-footer\">\n");
      out.write("        <div class=\"pull-right hidden-xs\">\n");
      out.write("            <b>Version</b> 1.0.8\n");
      out.write("        </div>\n");
      out.write("        <strong>Copyright &copy; 2014-2017 <a\n");
      out.write("                href=\"http://www.itcast.cn\">研究院研发部</a>.\n");
      out.write("        </strong> All rights reserved.\n");
      out.write("    </footer>\n");
      out.write("    <!-- 底部导航 /-->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("</script>\n");
      out.write("<script src=\"../plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../plugins/raphael/raphael-min.js\"></script>\n");
      out.write("<script src=\"../plugins/morris/morris.min.js\"></script>\n");
      out.write("<script src=\"../plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("<script src=\"../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<script src=\"../plugins/knob/jquery.knob.js\"></script>\n");
      out.write("<script src=\"../plugins/daterangepicker/moment.min.js\"></script>\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<script src=\"../plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\n");
      out.write("<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("<script src=\"../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"../plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<script src=\"../plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("<script src=\"../plugins/adminLTE/js/app.min.js\"></script>\n");
      out.write("<script src=\"../plugins/treeTable/jquery.treetable.js\"></script>\n");
      out.write("<script src=\"../plugins/select2/select2.full.min.js\"></script>\n");
      out.write("<script src=\"../plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\n");
      out.write("<script\n");
      out.write("        src=\"../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/markdown.js\"></script>\n");
      out.write("<script src=\"../plugins/bootstrap-markdown/js/to-markdown.js\"></script>\n");
      out.write("<script src=\"../plugins/ckeditor/ckeditor.js\"></script>\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.js\"></script>\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\n");
      out.write("<script src=\"../plugins/input-mask/jquery.inputmask.extensions.js\"></script>\n");
      out.write("<script src=\"../plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"../plugins/datatables/dataTables.bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../plugins/chartjs/Chart.min.js\"></script>\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.min.js\"></script>\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.resize.min.js\"></script>\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.pie.min.js\"></script>\n");
      out.write("<script src=\"../plugins/flot/jquery.flot.categories.min.js\"></script>\n");
      out.write("<script src=\"../plugins/ionslider/ion.rangeSlider.min.js\"></script>\n");
      out.write("<script src=\"../plugins/bootstrap-slider/bootstrap-slider.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        /*table tree*/\n");
      out.write("        $(\"#collapse-table\").treetable({\n");
      out.write("            expandable: true\n");
      out.write("        });\n");
      out.write("        // 选择框\n");
      out.write("        $(\".select2\").select2();\n");
      out.write("\n");
      out.write("        // WYSIHTML5编辑器\n");
      out.write("        $(\".textarea\").wysihtml5({\n");
      out.write("            locale: 'zh-CN'\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // 设置激活菜单\n");
      out.write("    function setSidebarActive(tagUri) {\n");
      out.write("        var liObj = $(\"#\" + tagUri);\n");
      out.write("        if (liObj.length > 0) {\n");
      out.write("            liObj.parent().parent().addClass(\"active\");\n");
      out.write("            liObj.addClass(\"active\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("\n");
      out.write("        // 激活导航位置\n");
      out.write("        setSidebarActive(\"admin-datalist\");\n");
      out.write("\n");
      out.write("        // 列表按钮\n");
      out.write("        $(\"#dataList td input[type='checkbox']\").iCheck({\n");
      out.write("            checkboxClass: 'icheckbox_square-blue',\n");
      out.write("            increaseArea: '20%'\n");
      out.write("        });\n");
      out.write("        // 全选操作\n");
      out.write("        $(\"#selall\").click(function () {\n");
      out.write("            var clicks = $(this).is(':checked');\n");
      out.write("            if (!clicks) {\n");
      out.write("                $(\"#dataList td input[type='checkbox']\").iCheck(\"uncheck\");\n");
      out.write("            } else {\n");
      out.write("                $(\"#dataList td input[type='checkbox']\").iCheck(\"check\");\n");
      out.write("            }\n");
      out.write("            $(this).data(\"clicks\", !clicks);\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/user-show.jsp(146,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/user-show.jsp(146,32) '${user.roles}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${user.roles}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/user-show.jsp(146,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("role");
    // /pages/user-show.jsp(146,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("vs1");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr data-tt-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vs1.index+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" data-tt-parent-id=\"0\"\">\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleDesc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /pages/user-show.jsp(151,36) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/pages/user-show.jsp(151,36) '${role.permissions}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${role.permissions}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/user-show.jsp(151,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("permission");
    // /pages/user-show.jsp(151,36) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("vs2");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr data-tt-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vs1.index+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('-');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vs2.index+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("                                            data-tt-parent-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vs1.index+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${permission.permissionName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${permission.url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}