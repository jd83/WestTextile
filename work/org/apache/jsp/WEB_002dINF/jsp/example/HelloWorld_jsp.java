/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-02-09 14:57:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HelloWorld_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Hiking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,300,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t$('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("\t\ttype: 'inline',\n");
      out.write("\t\tfixedContentPos: false,\n");
      out.write("\t\tfixedBgPos: true,\n");
      out.write("\t\toverflowY: 'auto',\n");
      out.write("\t\tcloseBtnInside: true,\n");
      out.write("\t\tpreloader: false,\n");
      out.write("\t\tmidClick: true,\n");
      out.write("\t\tremovalDelay: 300,\n");
      out.write("\t\tmainClass: 'my-mfp-zoom-in'\n");
      out.write("\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- header -->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("  \t    <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t\t<div class=\"search2\">\n");
      out.write("\t\t\t\t\t  <form>\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search..';}\"/>\n");
      out.write("\t\t\t\t\t\t <input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t  </form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-left\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"registration.html\">Registration</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div> \t\t\t\t\n");
      out.write("\t</div> \t\t\n");
      out.write("\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" class=\"img-responsive\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"head-nav\">\n");
      out.write("\t\t\t\t\t\t<span class=\"menu\"> </span>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"news.html\">News</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"events.html\">Events</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"404.html\">Blog</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contacts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t<!-- script-for-nav -->\n");
      out.write("\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t$( \"span.menu\" ).click(function() {\n");
      out.write("\t\t\t\t\t\t  $( \".head-nav ul\" ).slideToggle(300, function() {\n");
      out.write("\t\t\t\t\t\t\t// Animation complete.\n");
      out.write("\t\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t<!-- script-for-nav -->\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t</div> \t\n");
      out.write("\t<div class=\"banner\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"wmuSlider example1 section\" id=\"section-1\">\n");
      out.write("\t\t\t   <article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t   \t   \t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t<h1>Let's enjoy the wonders of the nature together! </h1>\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas congue gravida ex, a maximus metussemper et. Curabitur non enim pharetra, dictum tortor quis, hendrerit tortor. Maecenas finibus quis nulla facilisis. Aenean dignissim magna et est gravida lacinia.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t <article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t   \t   \t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t<h1>Let's enjoy the wonders of the nature together! </h1>\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas congue gravida ex, a maximus metussemper et. Curabitur non enim pharetra, dictum tortor quis, hendrerit tortor. Maecenas finibus quis nulla facilisis. Aenean dignissim magna et est gravida lacinia.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t <article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t   \t   \t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t<h1>Let's enjoy the wonders of the nature together! </h1>\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas congue gravida ex, a maximus metussemper et. Curabitur non enim pharetra, dictum tortor quis, hendrerit tortor. Maecenas finibus quis nulla facilisis. Aenean dignissim magna et est gravida lacinia.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<ul class=\"wmuSliderPagination\">\n");
      out.write("                \t<li><a href=\"#\" class=\"\">0</a></li>\n");
      out.write("                \t<li><a href=\"#\" class=\"\">1</a></li>\n");
      out.write("                \t<li><a href=\"#\" class=\"\">2</a></li>\n");
      out.write("                </ul>\n");
      out.write("\t\t  </div>\t\t\n");
      out.write("\t\t<!-- script -->\n");
      out.write("          <script src=\"js/jquery.wmuSlider.js\"></script> \n");
      out.write("\t\t\t<script>\n");
      out.write("       \t\t\t$('.example1').wmuSlider();         \n");
      out.write("   \t\t    </script>\n");
      out.write("\t\t\t<!-- script -->\t\t\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- header -->\n");
      out.write("<!-- curabitur -->\n");
      out.write("\t<div class=\"curabitur\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-4 curabitur-top\">\n");
      out.write("\t\t\t\t<i class=\"hammer\"></i>\n");
      out.write("\t\t\t\t<h4>Contrary to popular</h4>\n");
      out.write("\t\t\t\t<p>Pellentesque eu congue sapien. Donec hendrerit viverra finibus. Nulla eget sollicitudin leo. Morbi lacinia libero urna necrfaucibus nulla mollis et. </p>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn  btn-1c btn1 btn-1d\">More</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 curabitur-top\">\n");
      out.write("\t\t\t\t<i class=\"timer\"></i>\n");
      out.write("\t\t\t\t<h4>Contrary to popular</h4>\n");
      out.write("\t\t\t\t<p>Pellentesque eu congue sapien. Donec hendrerit viverra finibus. Nulla eget sollicitudin leo. Morbi lacinia libero urna necrfaucibus nulla mollis et. </p>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn  btn-1c btn1 btn-1d\">More</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 curabitur-top\">\n");
      out.write("\t\t\t\t<i class=\"tent\"></i>\n");
      out.write("\t\t\t\t<h4>Contrary to popular</h4>\n");
      out.write("\t\t\t\t<p>Pellentesque eu congue sapien. Donec hendrerit viverra finibus. Nulla eget sollicitudin leo. Morbi lacinia libero urna necrfaucibus nulla mollis et. </p>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn  btn-1c btn1 btn-1d\">More</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<!-- curabitur -->\n");
      out.write("<!-- welcome -->\n");
      out.write("\t<div class=\"welcome\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>Welcome</h2>\n");
      out.write("\t\t\t<p>Donec id velit feugiat, congue nunc non, iaculis neque. Vivamus nisl justo, finibus in interdum nec, iaculis non odio. Aliquam lacus tellus, tempus a finibus ac, laoreet rutrum dui. Praesent ex nulla, sagittis imperdiet convallis a, tincidunt sit amet mauris. Cras suscipit cursus eros id tincidunt. Praesent ac dapibus lacus, condimentum commodo ligula.</p>\n");
      out.write("\t\t\t<a href=\"#\" class=\"btn  btn-1c btn1 btn-1d\">More</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- welcome -->\n");
      out.write("<!-- vide -->\n");
      out.write("\t<div class=\"vide\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-8 vide-left\">\n");
      out.write("\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur a maximus metus semper et. </h3>\n");
      out.write("\t\t\t\t<h6>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas congue gravida ex,a maximus metus semper et. Curabitur non enim pharetra, dictum tortor quis, hendrerit tortor.</h6>\n");
      out.write("\t\t\t\t<p>Maecenas finibus quis nulla id facilisis. Aenean dignissim magna et est elit porttitor \n");
      out.write("\t\t\t\t\tgravida lacinia. Fusce elementum massa at eros lacinia imperdiet. Aenean mollis ultricies \n");
      out.write("\t\t\t\t\tdictum.Praesent suscipit urna eget elit porttitor mollis. Quisque mollis rhoncus ante, eu \n");
      out.write("\t\t\t\t\tinterdum quam vehicula cursus. Nam bibendum odio eu sem semper posuere.  </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 vide-right\">\n");
      out.write("\t\t\t\t<img src=\"images/img1.jpg\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><span> </span></a>\n");
      out.write("\t\t\t\t<div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("\t\t\t\t\t<iframe src=\"//player.vimeo.com/video/78016933\" width=\"\" height=\"\" frameborder=\"0\" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- vide -->\n");
      out.write("<!-- events -->\n");
      out.write("\t<div class=\"events\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>Upcoming Events</h2>\n");
      out.write("\t\t\t<div class=\"col-md-4 events-top\">\n");
      out.write("\t\t\t\t<img src=\"images/img2.jpg\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t<div class=\"events-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"events-left\">\n");
      out.write("\t\t\t\t\t\t<h5>23</h5>\n");
      out.write("\t\t\t\t\t\t<span>sep</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"events-right\">\n");
      out.write("\t\t\t\t\t\t<h6>Phasellus laoreet lorem nec</h6>\n");
      out.write("\t\t\t\t\t\t<p>Pellentesque eu congue sapien. Donec hendrerit viverra finibus. Nulla eget sollicitudin leo. Morbi lacinia libero urna necrfaucibus nulla mollis et. </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 events-top\">\n");
      out.write("\t\t\t\t<img src=\"images/img3.jpg\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t<div class=\"events-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"events-left\">\n");
      out.write("\t\t\t\t\t\t<h5>06</h5>\n");
      out.write("\t\t\t\t\t\t<span>jun</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"events-right\">\n");
      out.write("\t\t\t\t\t\t<h6>Phasellus laoreet lorem nec</h6>\n");
      out.write("\t\t\t\t\t\t<p>Pellentesque eu congue sapien. Donec hendrerit viverra finibus. Nulla eget sollicitudin leo. Morbi lacinia libero urna necrfaucibus nulla mollis et. </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 events-top\">\n");
      out.write("\t\t\t\t<img src=\"images/img5.jpg\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("\t\t\t\t<div class=\"events-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"events-left\">\n");
      out.write("\t\t\t\t\t\t<h5>17</h5>\n");
      out.write("\t\t\t\t\t\t<span>dec</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"events-right\">\n");
      out.write("\t\t\t\t\t\t<h6>Phasellus laoreet lorem nec</h6>\n");
      out.write("\t\t\t\t\t\t<p>Pellentesque eu congue sapien. Donec hendrerit viverra finibus. Nulla eget sollicitudin leo. Morbi lacinia libero urna necrfaucibus nulla mollis et. </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- events -->\n");
      out.write("<!-- footer -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-3 information\">\n");
      out.write("\t\t\t\t<h4>Information</h4>\n");
      out.write("\t\t\t\t<div class=\"nav-bottom\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"news.html\">News</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"events.html\">Events</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"404.html\">Blog</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contacts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 keep\">\n");
      out.write("\t\t\t\t<h4>follow us</h4>\n");
      out.write("\t\t\t\t<div class=\"social\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"facebok\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twiter\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"rss\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 email\">\n");
      out.write("\t\t\t\t<h4>Email updates</h4>\n");
      out.write("\t\t\t\t<p>Curabitur justo augue, euismod nec tortor tincidunt.</p>\n");
      out.write("\t\t\t\t<div class=\"email-top\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"text\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\">\n");
      out.write("\t\t\t\t\t\t</form>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 conta\">\n");
      out.write("\t\t\t\t<h4>Contact us</h4>\n");
      out.write("\t\t\t\t<p>Tel 1:+1 234 567 8767</p>\n");
      out.write("\t\t\t\t<p>Tel 2:+1 234 567 8767</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t<div class=\"bottom\">\n");
      out.write("\t\t\t\t<p>Copyright &copy; 2015.Company name All rights reserved.<a target=\"_blank\" href=\"http://sc.chinaz.com/moban/\">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- footer -->\n");
      out.write("\n");
      out.write("<div style=\"display:none\"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
