package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/top.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005ftheme_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005ftheme_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005ftheme_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus_005fid.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.release();
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
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
      out.write("\t\tString.prototype.trim=function(){\r\n");
      out.write("\t\t　　    return this.replace(/(^\\s*)|(\\s*$)/g, \"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction isUniqueArr(arr) {\r\n");
      out.write("\t\t\tvar isUnique=true;\r\n");
      out.write("\t\t\tvar  hash = {};\r\n");
      out.write("\t\t\tfor (var i = 0, elem; (elem = arr[i]) != null; i++) {\r\n");
      out.write("\t\t\t\telem=arr[i].value;\r\n");
      out.write("\t\t\t\tif (!hash[elem]) {\r\n");
      out.write("\t\t\t\t\thash[elem] = true;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tisUnique=false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn isUnique;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction isUniqueStrInArr(arr,str) {\r\n");
      out.write("\t\t\tvar isUnique=true;\r\n");
      out.write("\t\t\tfor(var i=0;i<arr.length;i++){\r\n");
      out.write("\t\t\t\tif(arr[i]==str){\r\n");
      out.write("\t\t\t\t\tisUnique=false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn isUnique;\r\n");
      out.write("\t\t}\r\n");
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
      out.write("\t\t\t//divShopInfo.id=\"divShopInfo-\"+divShopInfoCnt;\r\n");
      out.write("\r\n");
      out.write("\t\t\ttop.appendChild(divShopInfo);\t\t\t\r\n");
      out.write("\t\t\tdivShopInfos=document.getElementsByName(\"divShopInfo\");\r\n");
      out.write("\t\t\tdivShopInfoCnt=divShopInfos.length;\r\n");
      out.write("\r\n");
      out.write("\t\t\tfor (var k=0;k<divShopInfoCnt;k++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar shopInfoNode=divShopInfos.item(k);\r\n");
      out.write("\t\t\t\tvar topNodeList=shopInfoNode.childNodes\r\n");
      out.write("\t\t\t\tif(k>0){\r\n");
      out.write("\t\t\t\t\tshopInfoNode.id=\"divShopInfo-\"+k;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tfor(var i=0;i<topNodeList.length;i++){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(topNodeList.item(i).tagName!=undefined && topNodeList.item(i).tagName==\"DIV\"){\r\n");
      out.write("\t\t\t\t\t\tvar divNodeList=topNodeList.item(i).getElementsByTagName(\"INPUT\");\r\n");
      out.write("\t\t\t\t\t\t//var divNodeList=topNodeList.item(i).childNodes;\r\n");
      out.write("\t\t\t\t\t\tfor(var j=0;j<divNodeList.length;j++){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar elementName=\"shops[\"+k+\"].\"+divNodeList.item(j).id;\r\n");
      out.write("\t\t\t\t\t\t\tdivNodeList.item(j).name=elementName;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction removeShopInfo(obj){\r\n");
      out.write("\t\t\tvar top=document.getElementById(\"divShopInfoAuto\");\r\n");
      out.write("\t\t\tvar div=document.getElementsByName(\"divShopInfo\");\r\n");
      out.write("\t\t\tif(div.length>1){\r\n");
      out.write("\t\t\t\ttop.removeChild(obj);\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction addUploadFile(){\r\n");
      out.write("\t\t\tvar parentTr=document.getElementById(\"tbUploadFile\");\r\n");
      out.write("\t\t\tvar trFile=document.getElementById(\"trUploadFile\").cloneNode(true);\r\n");
      out.write("\t\t\tparentTr.appendChild(trFile);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction removeUploadFile(obj){\r\n");
      out.write("\t\t\tvar parentTr=document.getElementById(\"tbUploadFile\");\r\n");
      out.write("\t\t\tvar trFile=document.getElementsByName(\"trUploadFile\");\r\n");
      out.write("\t\t\tif(trFile.length>1){\r\n");
      out.write("\t\t\t\tif(obj.parentNode.tagName==\"TBODY\"){\r\n");
      out.write("\t\t\t\t\tobj=obj.parentNode;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tparentTr.removeChild(obj);\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\tfunction uploadfile(){           \r\n");
      out.write("\t\t\tvar ff = document.getElementsByName(\"upload\");\r\n");
      out.write("\t\t\tvar isUnique=isUniqueArr(ff);\r\n");
      out.write("\t\t\tif(ff[0].value==''|| ff[0].value==null){                 \r\n");
      out.write("\t\t\t\talert('请至少选择文件！');             \r\n");
      out.write("\t\t\t}else if (!isUnique)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert('上传文件不能重复，请删除重复文件！');\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdocument.fileupload.submit();             \r\n");
      out.write("\t\t\t}         \r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tfunction showUploadFiles(){\r\n");
      out.write("\t\t\tvar msg = '");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("'; \r\n");
      out.write("\t\t\tvar err = '");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("'; \r\n");
      out.write("\t\t\tvar file = '");
      if (_jspx_meth_s_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tfile=file.substr(1,file.length-2);\r\n");
      out.write("\t\t\t//parent.document.getElementById(\"divAddAttach\").innerHTML = file; \r\n");
      out.write("\r\n");
      out.write("\t\t\tparent.document.getElementById(\"msg\").innerHTML = msg; \r\n");
      out.write("\t\t\tparent.document.getElementById(\"error\").innerHTML = err; \r\n");
      out.write("\t\t\tif(err!=null&&err!=\"\"){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar arrfile=file.split(\",\");\r\n");
      out.write("\t\t\tfor (var i=0;i<arrfile.length;i++ )\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif(arrfile[i]==null||arrfile[i]==\"\"){\r\n");
      out.write("\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar createdFiles=parent.document.getElementsByName(\"filename\")\r\n");
      out.write("\t\t\t\tif(createdFiles==null)\r\n");
      out.write("\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\tvar arrCreatedFiles=new Array();\r\n");
      out.write("\t\t\t\tfor(var j=0;j<createdFiles.length;j++){\r\n");
      out.write("\t\t\t\t\tarrCreatedFiles.push(createdFiles[j].value);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar curFile=arrfile[i].trim();\r\n");
      out.write("\t\t\t\tif(!isUniqueStrInArr(arrCreatedFiles,curFile)){\r\n");
      out.write("\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar spanUploadedFile=document.createElement(\"input\");\r\n");
      out.write("\t\t\t\tvar attValue=document.createAttribute(\"value\");\r\n");
      out.write("\t\t\t\tvar attName=document.createAttribute(\"name\");\r\n");
      out.write("\t\t\t\tattValue.value=curFile;\r\n");
      out.write("\t\t\t\tattName.value=\"filename\"\r\n");
      out.write("\t\t\t\tspanUploadedFile.setAttributeNode(attValue);\r\n");
      out.write("\t\t\t\tspanUploadedFile.setAttributeNode(attName);\r\n");
      out.write("\t\t\t\tparent.document.getElementById(\"divAddAttach\").appendChild(spanUploadedFile);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tparent.document.getElementById(\"uploadfilehtml\").value=parent.document.getElementById(\"divAddAttach\").innerHTML;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction show(){         \r\n");
      out.write("\t\t\tvar mask = document.getElementById(\"mask\");                       \r\n");
      out.write("\t\t\tvar h_c = document.documentElement.clientHeight/3;         \r\n");
      out.write("\t\t\tvar w_c = document.documentElement.clientWidth/3;                  \r\n");
      out.write("\t\t\tvar h_b = document.body.clientHeight/3;         \r\n");
      out.write("\t\t\tvar w_b = document.body.clientWidth/3;                            \r\n");
      out.write("\t\t\tmask.style.width = w_c > w_b ? w_c+\"px\" : w_b+\"px\";        \r\n");
      out.write("\t\t\tmask.style.height = h_c > h_b ? h_c+\"px\" : h_b+\"px\";                  \r\n");
      out.write("\t\t\tmask.style.left = mask.style.width;\r\n");
      out.write("\t\t\tmask.style.top = mask.style.height;\r\n");
      out.write("\t\t\tmask.style.display = \"block\";     \r\n");
      out.write("\t\t}           \r\n");
      out.write("\t\tfunction hidden(){\r\n");
      out.write("\t\t\tvar mask = document.getElementById(\"mask\");             \r\n");
      out.write("\t\t\tmask.style.display = \"none\";    \r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction popUpload(){         \r\n");
      out.write("\t\t\tvar mask = document.getElementById(\"mask\");\r\n");
      out.write("\t\t\tif(mask.style.display ==\"none\"){\r\n");
      out.write("\t\t\t\tshow();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\thidden();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction closeUpload(){\r\n");
      out.write("\t\t\tdocument.getElementById('mask').style.display='none';\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"showUploadFiles()\" style=\"background-color:#E6E6FA\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<table width=\"90%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("  \t    <div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../resource/images/logo.jpg\" class=\"img-responsive\" alt=\"\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-left\" style=\"font-size:12px;font-family:微软雅黑\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("\t\t\t<div class=\"header-bottom\"  style=\"background-color:#7CCD7C\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"head-nav\" style=\"font-size:12px;font-family:微软雅黑\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"menu\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"HelloWorld\">主页</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.html\">查询</a></li>\r\n");
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
      out.write("\t\t\t</div>");
      out.write("\r\n");
      out.write("<!-- content -->\r\n");
      out.write("\r\n");
      out.write("<!-- registration -->\r\n");
      out.write("\t<div class=\"main-1\" style=\"background-color:#7CCD7C\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"register\">\r\n");
      out.write("\t\t  \t  <form action=\"");
      if (_jspx_meth_s_005fif_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_s_005felse_005f1(_jspx_page_context))
        return;
      out.write("\" method=\"POST\"> \r\n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\r\n");
      out.write("\t\t\t\t\t<font color=\"red\" size=\"3\">");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t<h3>个人信息</h3>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>手机/邮箱<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"user.username\" value=\"");
      if (_jspx_meth_s_005fproperty_005f4(_jspx_page_context))
        return;
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fhidden_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>QQ名<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"  name=\"user.displayname\" value=\"");
      if (_jspx_meth_s_005fproperty_005f5(_jspx_page_context))
        return;
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>密码<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"user.password\" value=\"");
      if (_jspx_meth_s_005fproperty_005f6(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>确认密码<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"repassword\"  value=\"");
      if (_jspx_meth_s_005fproperty_005f7(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" id=\"chkShopInfo\" onclick=\"showChkInfo(this,'divShopInfoAuto');\" ");
      if (_jspx_meth_s_005fproperty_005f8(_jspx_page_context))
        return;
      out.write("><i> </i>管理员验证商铺信息（验证后，才能使用查询管理功能）</label>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005felse_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t <!--<div class=\"register-bottom-grid\" id=\"divShopInfoAuto\" style=\"display: none\">\t-->\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\r\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" id=\"chkAddAttach\" onclick=\"popUpload()\" ><i> </i>上传商铺文件图片</label>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t\t   <input type=\"hidden\" id=\"uploadfilehtml\" name=\"uploadfilehtml\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t   <div class=\"register-bottom-grid\" id=\"divAddAttach\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fproperty_005f17(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\r\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" id=\"chkAdditionInfo\" onclick=\"showChkInfo(this,'divAdditionInfo');\"  ");
      if (_jspx_meth_s_005fproperty_005f18(_jspx_page_context))
        return;
      out.write("><i> </i>补充个人信息</label>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005felse_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <div class=\"register-bottom-grid\" id=\"divAdditionInfo\" style=\"display: none\">-->\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>姓名</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"user.name\" value=\"");
      if (_jspx_meth_s_005fproperty_005f19(_jspx_page_context))
        return;
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>性别</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\"  name=\"user.sex\" value=\"");
      if (_jspx_meth_s_005fproperty_005f20(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>身份证号码</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"user.identityid\" value=\"");
      if (_jspx_meth_s_005fproperty_005f21(_jspx_page_context))
        return;
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>QQ号码</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\"  name=\"user.qqnumber\" value=\"");
      if (_jspx_meth_s_005fproperty_005f22(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>职业</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"user.career\" value=\"");
      if (_jspx_meth_s_005fproperty_005f23(_jspx_page_context))
        return;
      out.write("\"/> \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>年龄</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"user.age\" value=\"");
      if (_jspx_meth_s_005fproperty_005f24(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t </div>\t\t\r\n");
      out.write("\t\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>备注</span>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"user.note\" value=\"");
      if (_jspx_meth_s_005fproperty_005f25(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t </div>\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t<div class=\"register-but\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"popUpload()\" value=\"点击上传文件\"/>\r\n");
      out.write("\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t<div class=\"register-but\">\r\n");
      out.write("\t\t\t\t   <input type=\"submit\" value=\"");
      if (_jspx_meth_s_005fif_005f5(_jspx_page_context))
        return;
      if (_jspx_meth_s_005felse_005f5(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<!--上传文件-->\r\n");
      out.write("\t\t\t<div id=\"mask\" class=\"mask\" style=\"display:none\">\r\n");
      out.write("\t\t\t <form action=\"Upload\" name=\"fileupload\" method=\"POST\" enctype=\"multipart/form-data\" target=\"hidden_frame\">\r\n");
      out.write("\t\t\t\t <div class=\"upload-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table id=\"tbUploadFile\" border=0 width=\"95%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<caption>上传附件</caption>\r\n");
      out.write("\t\t\t\t\t\t<tr id=\"trUploadFile\" name=\"trUploadFile\" Valign=\"top\"><td Valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"+\" onclick=\"addUploadFile()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"-\" onclick=\"removeUploadFile(this.parentNode.parentNode)\"/>\r\n");
      out.write("\t\t\t\t\t\t</td><td>\r\n");
      out.write("\t\t\t\t\t\t\t商铺号\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"shopname\" id=\"shopname\" value=\"");
      if (_jspx_meth_s_005fproperty_005f26(_jspx_page_context))
        return;
      out.write("\" onblur=\"if (this.value == '') {this.value = '格式：x-x-x';}\"> \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</td><td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" name=\"upload\"><br/>\r\n");
      out.write("\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<table border=0 width=\"95%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\"><td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"上传\" onclick=\"uploadfile()\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"关闭\" onclick=\"closeUpload()\"/>\r\n");
      out.write("\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td colspan=2>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"error\"></span><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"msg\"></span><br/>\r\n");
      out.write("\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<iframe name='hidden_frame' id=\"hidden_frame\" style='display:none'></iframe>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- registration -->\r\n");
      out.write("<!-- content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\t<div class=\"footer\" style=\"background-color:#7CCD7C\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"bottom\">\r\n");
      out.write("\t\t\t\t<p>Copyright &copy; 2015.West Textile Member All rights reserved.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- footer -->");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /WEB-INF/jsp/registration.jsp(147,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#message");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent(null);
    // /WEB-INF/jsp/registration.jsp(148,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("#error");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent(null);
    // /WEB-INF/jsp/registration.jsp(149,15) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("#request.uploadFileName");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/top.jsp(10,6) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("null==#session.username||#session.username.isEmpty()");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"Register_Forward\">注册</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"Login_Forward\">登录</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f0.setParent(null);
    int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
    if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"Register_Forward\">");
        if (_jspx_meth_s_005fproperty_005f3(_jspx_th_s_005felse_005f0, _jspx_page_context))
          return true;
        out.write("</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"Logout\">退出</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f0);
    // /WEB-INF/jsp/top.jsp(15,53) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("#session.username");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/registration.jsp(230,21) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("#session.username==null||#session.username.isEmpty()");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("Register");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f1 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f1.setParent(null);
    int _jspx_eval_s_005felse_005f1 = _jspx_th_s_005felse_005f1.doStartTag();
    if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f1.doInitBody();
      }
      do {
        out.write("Register_Update");
        int evalDoAfterBody = _jspx_th_s_005felse_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent(null);
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f4 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f4.setParent(null);
    // /WEB-INF/jsp/registration.jsp(236,53) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f4.setValue("#request.user.username");
    int _jspx_eval_s_005fproperty_005f4 = _jspx_th_s_005fproperty_005f4.doStartTag();
    if (_jspx_th_s_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005ftheme_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fhidden_005f0.setParent(null);
    // /WEB-INF/jsp/registration.jsp(237,6) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setTheme("simple");
    // /WEB-INF/jsp/registration.jsp(237,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fhidden_005f0.setName("user.userid");
    int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
    if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005ftheme_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005ftheme_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f5 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f5.setParent(null);
    // /WEB-INF/jsp/registration.jsp(241,57) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f5.setValue("#request.user.displayname");
    int _jspx_eval_s_005fproperty_005f5 = _jspx_th_s_005fproperty_005f5.doStartTag();
    if (_jspx_th_s_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f6 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f6.setParent(null);
    // /WEB-INF/jsp/registration.jsp(245,57) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f6.setValue("#request.user.password");
    int _jspx_eval_s_005fproperty_005f6 = _jspx_th_s_005fproperty_005f6.doStartTag();
    if (_jspx_th_s_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f7 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f7.setParent(null);
    // /WEB-INF/jsp/registration.jsp(249,55) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f7.setValue("#request.repassword");
    int _jspx_eval_s_005fproperty_005f7 = _jspx_th_s_005fproperty_005f7.doStartTag();
    if (_jspx_th_s_005fproperty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f8 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f8.setParent(null);
    // /WEB-INF/jsp/registration.jsp(254,118) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f8.setValue("#request.hasshopinfo");
    int _jspx_eval_s_005fproperty_005f8 = _jspx_th_s_005fproperty_005f8.doStartTag();
    if (_jspx_th_s_005fproperty_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/registration.jsp(257,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("#request.hasshopinfo!=''&& #request.hasshopinfo!=null");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div class=\"register-bottom-grid\" id=\"divShopInfoAuto\" style=\"display: block\">\t\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f2 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f2.setParent(null);
    int _jspx_eval_s_005felse_005f2 = _jspx_th_s_005felse_005f2.doStartTag();
    if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div class=\"register-bottom-grid\" id=\"divShopInfoAuto\" style=\"display: none\">\t\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus_005fid.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent(null);
    // /WEB-INF/jsp/registration.jsp(264,5) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("shops");
    // /WEB-INF/jsp/registration.jsp(264,5) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setId("sp");
    // /WEB-INF/jsp/registration.jsp(264,5) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setStatus("u");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write(" \r\n");
        out.write("\t\t\t\t\t\t <div class=\"register-bottom-grid\" id=\"divShopInfo\" name=\"divShopInfo\">\r\n");
        out.write("\t\t\t\t\t\t\t <span>增加商铺<input type=\"button\" value=\"+\" onclick=\"addShopInfo();\"/>&nbsp&nbsp删除商铺<input type=\"button\" value=\"-\" onclick=\"removeShopInfo(this.parentNode.parentNode);\"/></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t <div class=\"wow fadeInLeft\" name=\"divShopName\" data-wow-delay=\"0.4s\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span>商铺号<label>*</label></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shops[");
        if (_jspx_meth_s_005fproperty_005f9(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("].shopname\" id=\"shopname\" value=\"");
        if (_jspx_meth_s_005fproperty_005f10(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\" onblur=\"if (this.value == '') {this.value = '格式：x-x-x';}\"> \r\n");
        out.write("\t\t\t\t\t\t\t\t </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t <div class=\"wow fadeInRight\" name=\"divShopType\" data-wow-delay=\"0.4s\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span>商铺类型<label>*</label></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shops[");
        if (_jspx_meth_s_005fproperty_005f11(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("].shoptype\" id=\"shoptype\" value=\"");
        if (_jspx_meth_s_005fif_005f3(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_s_005felse_005f3(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\" onblur=\"if (this.value == '') {this.value = '经营权或产权';}\"> \r\n");
        out.write("\t\t\t\t\t\t\t\t </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t <div class=\"wow fadeInLeft\" name=\"divShopSquare\" data-wow-delay=\"0.4s\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span>商铺面积<label>*</label></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shops[");
        if (_jspx_meth_s_005fproperty_005f13(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("].shopsquare\" id=\"shopsquare\" value=\"");
        if (_jspx_meth_s_005fproperty_005f14(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\"/> \r\n");
        out.write("\t\t\t\t\t\t\t\t </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t <div class=\"wow fadeInRight\" name=\"divShopAmount\" data-wow-delay=\"0.4s\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<span>商铺总价<label>*</label></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"shops[");
        if (_jspx_meth_s_005fproperty_005f15(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("].shopamount\" id=\"shopamount\" value=\"");
        if (_jspx_meth_s_005fproperty_005f16(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t\t\t </div>\r\n");
        out.write("\t\t\t\t\t\t </div>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus_005fid.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus_005fid.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f9 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(269,40) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f9.setValue("#u.index");
    int _jspx_eval_s_005fproperty_005f9 = _jspx_th_s_005fproperty_005f9.doStartTag();
    if (_jspx_th_s_005fproperty_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f10 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(269,103) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f10.setValue("#sp.shopname");
    int _jspx_eval_s_005fproperty_005f10 = _jspx_th_s_005fproperty_005f10.doStartTag();
    if (_jspx_th_s_005fproperty_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f11 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(273,40) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f11.setValue("#u.index");
    int _jspx_eval_s_005fproperty_005f11 = _jspx_th_s_005fproperty_005f11.doStartTag();
    if (_jspx_th_s_005fproperty_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(273,103) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("#sp.shoptype!=null");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        if (_jspx_meth_s_005fproperty_005f12(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f12 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /WEB-INF/jsp/registration.jsp(273,135) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f12.setValue("#sp.shoptype");
    int _jspx_eval_s_005fproperty_005f12 = _jspx_th_s_005fproperty_005f12.doStartTag();
    if (_jspx_th_s_005fproperty_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f3 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    int _jspx_eval_s_005felse_005f3 = _jspx_th_s_005felse_005f3.doStartTag();
    if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f3.doInitBody();
      }
      do {
        out.write("经营权或产权");
        int evalDoAfterBody = _jspx_th_s_005felse_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f13 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(277,40) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f13.setValue("#u.index");
    int _jspx_eval_s_005fproperty_005f13 = _jspx_th_s_005fproperty_005f13.doStartTag();
    if (_jspx_th_s_005fproperty_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f14 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(277,107) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f14.setValue("#sp.shopsquare");
    int _jspx_eval_s_005fproperty_005f14 = _jspx_th_s_005fproperty_005f14.doStartTag();
    if (_jspx_th_s_005fproperty_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f15 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(281,40) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f15.setValue("#u.index");
    int _jspx_eval_s_005fproperty_005f15 = _jspx_th_s_005fproperty_005f15.doStartTag();
    if (_jspx_th_s_005fproperty_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f16 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /WEB-INF/jsp/registration.jsp(281,107) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f16.setValue("#sp.shopamount");
    int _jspx_eval_s_005fproperty_005f16 = _jspx_th_s_005fproperty_005f16.doStartTag();
    if (_jspx_th_s_005fproperty_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f17 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f17.setParent(null);
    // /WEB-INF/jsp/registration.jsp(294,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f17.setValue("#request.uploadfilehtml");
    // /WEB-INF/jsp/registration.jsp(294,4) name = escape type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f17.setEscape(false);
    int _jspx_eval_s_005fproperty_005f17 = _jspx_th_s_005fproperty_005f17.doStartTag();
    if (_jspx_th_s_005fproperty_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_s_005fproperty_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f18 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f18.setParent(null);
    // /WEB-INF/jsp/registration.jsp(299,123) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f18.setValue("#request.hasadditioninfo");
    int _jspx_eval_s_005fproperty_005f18 = _jspx_th_s_005fproperty_005f18.doStartTag();
    if (_jspx_th_s_005fproperty_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent(null);
    // /WEB-INF/jsp/registration.jsp(302,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("#request.hasadditioninfo!='' && #request.hasadditioninfo!=null");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div class=\"register-bottom-grid\" id=\"divAdditionInfo\" style=\"display: block\">\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f4 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f4.setParent(null);
    int _jspx_eval_s_005felse_005f4 = _jspx_th_s_005felse_005f4.doStartTag();
    if (_jspx_eval_s_005felse_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div class=\"register-bottom-grid\" id=\"divAdditionInfo\" style=\"display: none\">\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felse_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f19 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f19.setParent(null);
    // /WEB-INF/jsp/registration.jsp(311,50) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f19.setValue("#request.user.name");
    int _jspx_eval_s_005fproperty_005f19 = _jspx_th_s_005fproperty_005f19.doStartTag();
    if (_jspx_th_s_005fproperty_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f20 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f20.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f20.setParent(null);
    // /WEB-INF/jsp/registration.jsp(315,50) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f20.setValue("#request.user.sex");
    int _jspx_eval_s_005fproperty_005f20 = _jspx_th_s_005fproperty_005f20.doStartTag();
    if (_jspx_th_s_005fproperty_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f20);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f21 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f21.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f21.setParent(null);
    // /WEB-INF/jsp/registration.jsp(319,56) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f21.setValue("#request.user.identityid");
    int _jspx_eval_s_005fproperty_005f21 = _jspx_th_s_005fproperty_005f21.doStartTag();
    if (_jspx_th_s_005fproperty_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f21);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f22 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f22.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f22.setParent(null);
    // /WEB-INF/jsp/registration.jsp(323,55) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f22.setValue("#request.user.qqnumber");
    int _jspx_eval_s_005fproperty_005f22 = _jspx_th_s_005fproperty_005f22.doStartTag();
    if (_jspx_th_s_005fproperty_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f22);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f23 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f23.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f23.setParent(null);
    // /WEB-INF/jsp/registration.jsp(327,52) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f23.setValue("#request.user.career");
    int _jspx_eval_s_005fproperty_005f23 = _jspx_th_s_005fproperty_005f23.doStartTag();
    if (_jspx_th_s_005fproperty_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f23);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f24 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f24.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f24.setParent(null);
    // /WEB-INF/jsp/registration.jsp(331,49) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f24.setValue("#request.user.age");
    int _jspx_eval_s_005fproperty_005f24 = _jspx_th_s_005fproperty_005f24.doStartTag();
    if (_jspx_th_s_005fproperty_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f24);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f25 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f25.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f25.setParent(null);
    // /WEB-INF/jsp/registration.jsp(335,50) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f25.setValue("#request.user.note");
    int _jspx_eval_s_005fproperty_005f25 = _jspx_th_s_005fproperty_005f25.doStartTag();
    if (_jspx_th_s_005fproperty_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f25);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent(null);
    // /WEB-INF/jsp/registration.jsp(345,35) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("#session.username==null||#session.username.isEmpty()");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write('注');
        out.write('册');
        int evalDoAfterBody = _jspx_th_s_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f5 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f5.setParent(null);
    int _jspx_eval_s_005felse_005f5 = _jspx_th_s_005felse_005f5.doStartTag();
    if (_jspx_eval_s_005felse_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f5.doInitBody();
      }
      do {
        out.write('修');
        out.write('改');
        int evalDoAfterBody = _jspx_th_s_005felse_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f26 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f26.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f26.setParent(null);
    // /WEB-INF/jsp/registration.jsp(361,63) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f26.setValue("#request.shopname");
    int _jspx_eval_s_005fproperty_005f26 = _jspx_th_s_005fproperty_005f26.doStartTag();
    if (_jspx_th_s_005fproperty_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f26);
    return false;
  }
}
