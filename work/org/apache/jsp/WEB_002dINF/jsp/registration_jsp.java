package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>注册帐号</title>\r\n");
      out.write("<link href=\"../resource/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link href=\"../resource/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Hiking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,300,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resource/css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script src=\"../resource/js/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"../resource/css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<script src=\"../resource/js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t$('.popup-with-zoom-anim').magnificPopup({\r\n");
      out.write("\t\ttype: 'inline',\r\n");
      out.write("\t\tfixedContentPos: false,\r\n");
      out.write("\t\tfixedBgPos: true,\r\n");
      out.write("\t\toverflowY: 'auto',\r\n");
      out.write("\t\tcloseBtnInside: true,\r\n");
      out.write("\t\tpreloader: false,\r\n");
      out.write("\t\tmidClick: true,\r\n");
      out.write("\t\tremovalDelay: 300,\r\n");
      out.write("\t\tmainClass: 'my-mfp-zoom-in'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showChkInfo(obj,disDiv){\r\n");
      out.write("\t\t\tchkShopInfo=document.getElementById(obj.id);\r\n");
      out.write("\t\t\tif (chkShopInfo.checked)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById(disDiv).setAttribute(\"style\",\"display: block;\");\r\n");
      out.write("\t\t\t\tif((obj.id).indexOf(\"ShopInfo\")>-1){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"divShopInfo\").setAttribute(\"style\",\"display: block;\");\r\n");
      out.write("\t\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.getElementById(disDiv).setAttribute(\"style\",\"display: none;\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction addShopInfo(){\r\n");
      out.write("\t\t\tvar divShopInfo=document.getElementById(\"divShopInfo\").cloneNode(true);\r\n");
      out.write("\t\t\tvar top=document.getElementById(\"divShopInfoAuto\");\r\n");
      out.write("\t\t\tvar divShopInfoCnt=top.childNodes.length;\r\n");
      out.write("\t\t\tdivShopInfo.id=\"divShopInfo-\"+(divShopInfoCnt-2);\r\n");
      out.write("\t\t\ttop.appendChild(divShopInfo);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction removeShopInfo(obj){\r\n");
      out.write("\t\t\tvar top=document.getElementById(\"divShopInfoAuto\");\r\n");
      out.write("\t\t\tif(obj.id!=\"divShopInfo\"){\r\n");
      out.write("\t\t\t\ttop.removeChild(obj);\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#E6E6FA\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("  \t    <div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../resource/images/logo.jpg\" class=\"img-responsive\" alt=\"\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-left\" style=\"font-size:12px;font-family:微软雅黑\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Register_Forward\">注册</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"login.html\">登录</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("\t\t\t<div class=\"header-bottom\"  style=\"background-color:#7CCD7C\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"head-nav\" style=\"font-size:11px;font-family:微软雅黑\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"menu\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"HelloWorld.action\">主页</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.html\">商铺查询</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.html\">费用管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"news.html\">资料馆</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"news.html\">问题建议</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"events.html\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t<!-- script-for-nav -->\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t$( \"span.menu\" ).click(function() {\r\n");
      out.write("\t\t\t\t\t\t  $( \".head-nav ul\" ).slideToggle(300, function() {\r\n");
      out.write("\t\t\t\t\t\t\t// Animation complete.\r\n");
      out.write("\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t<!-- script-for-nav -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("<!-- content -->\r\n");
      out.write("\r\n");
      out.write("<!-- registration -->\r\n");
      out.write("\t<div class=\"main-1\" style=\"background-color:#7CCD7C\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"register\">\r\n");
      out.write("\t\t  \t  <form action=\"Register\"> \r\n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\r\n");
      out.write("\t\t\t\t\t<h3>个人信息</h3>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>手机/邮箱<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"userWithBLOBs.username\"/> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>QQ名<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"  name=\"userWithBLOBs.displayname\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>密码<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"userWithBLOBs.password\">\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>确认密码<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\">\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" id=\"chkShopInfo\" onclick=\"showChkInfo(this,'divShopInfoAuto');\"><i> </i>验证商铺信息（验证该信息后，才能使用查询管理功能）</label>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t <div class=\"register-bottom-grid\" id=\"divShopInfoAuto\" style=\"display: none\">\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <div class=\"register-bottom-grid\" id=\"divShopInfo\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t <span>增加商铺<input type=\"button\" value=\"+\" onclick=\"addShopInfo();\"/>&nbsp&nbsp删除商铺<input type=\"button\" value=\"-\" onclick=\"removeShopInfo(this.parentNode.parentNode);\"/></span>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>商铺号<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shopname\"  value=\"格式：x-x-x。如1-1-1\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '格式：x-x-x';}\"> \r\n");
      out.write("\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>商铺类型<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>经营权<input type=\"radio\" name=\"shoptype\" value=\"经营权\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>产权<input type=\"radio\" name=\"shoptype\" value=\"产权\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>商铺面积<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shopsquare\"> \r\n");
      out.write("\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>商铺总价<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shopamount\">\r\n");
      out.write("\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\r\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" id=\"chkAdditionInfo\" onclick=\"showChkInfo(this,'divAdditionInfo');\"><i> </i>补充个人信息</label>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t <div class=\"register-bottom-grid\" id=\"divAdditionInfo\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>身份证号码</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userWithBLOBs.identityid\"> \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>QQ号码</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\"  name=\"userWithBLOBs.qqnumber\">\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>职业</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userWithBLOBs.career\"> \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>年龄</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userWithBLOBs.age\">\r\n");
      out.write("\t\t\t\t\t\t </div>\t\t\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>备注</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userWithBLOBs.note\">\r\n");
      out.write("\t\t\t\t\t\t </div>\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t<div class=\"register-but\">\r\n");
      out.write("\t\t\t\t   <input type=\"submit\" value=\"注册\">\r\n");
      out.write("\t\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- registration -->\r\n");
      out.write("<!-- content -->\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\t<div class=\"footer\" style=\"background-color:#7CCD7C\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"bottom\">\r\n");
      out.write("\t\t\t\t<p>Copyright &copy; 2015.West Textile Member All rights reserved.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
