/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.28.v20200408
 * Generated at: 2022-10-28 04:01:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Noticias;
import dao.ListNoticias;
import java.util.List;
import model.Comentarios;
import java.util.ArrayList;

public final class Comentarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("dao.ListNoticias");
    _jspx_imports_classes.add("model.Noticias");
    _jspx_imports_classes.add("model.Comentarios");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta NAME=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\r\n");
      out.write("    <title> Proyecto Noticiero </title>\r\n");
      out.write("    <!-- tipo de letra-->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Oswald:wght@200&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Vistaweb.css\">\r\n");
      out.write("    <!-- font aweson -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"contende\">\r\n");
      out.write("    <!-- navegacion -->\r\n");
      out.write("    <nav class=\"=nav-main\">\r\n");
      out.write("        <img src=\"img/logo.jpg\" alt=\"logoUMG\" class=\"nav-bus\" >\r\n");
      out.write("        <ul class=\"nav-menu\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">Inicio</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">Farandula</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">Deportes</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">Ciencia</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">Economia</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul class=\"nav-menu-lupa\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fas fa-search \">\r\n");
      out.write("                    </i>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <!-- selecionar noticias y sus comentarios -->\r\n");
      out.write("    <div class=\"noti-select\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");


            String ID = request.getParameter("var");



            int i;
            i = Integer.parseInt(ID);




            ListNoticias Nootis = new ListNoticias();

            Noticias n= Nootis.MostrarNoticia(i);



        
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("\r\n");
      out.write("            <img src=\"img/imagen");
      out.print(i);
      out.write(".jpg\" alt=\"NEWS");
      out.print(i);
      out.write("\">\r\n");
      out.write("            <h2>");
      out.print(n.getTitle() );
      out.write("</h2>\r\n");
      out.write("            <p>");
      out.print(n.getByline());
      out.write(" </p>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid assumenda at dignissimos doloremque et, iusto laboriosam laborum molestiae non odio omnis pariatur placeat praesentium rem repellendus sed similique vero! Minus?</p>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio dolor eligendi esse fugiat natus reiciendis repudiandae sunt ut voluptates. Consequuntur cumque hic ipsum iste obcaecati quidem recusandae rem sapiente, suscipit!</p>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusantium asperiores culpa ducimus fugiat incidunt maxime quis recusandae vel? Deserunt, fuga iusto modi nihil quisquam repellendus similique tenetur voluptate. Laborum, officia!</p>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam, aut blanditiis, culpa dignissimos doloribus eius fugiat ipsum labore, nostrum officiis perferendis porro quaerat quod quos reiciendis rem repudiandae soluta tempora.</p>\r\n");
      out.write("            <h4>");
      out.print(n.getTexto());
      out.write(" </h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--obtener lista de comentarios para cada Noticia  -->\r\n");
      out.write("        <div class=\"container-comments\">\r\n");
      out.write("            ");

                String na = request.getParameter("nombre");
                String me = request.getParameter("mensaje");

                int ins=0;
                ListNoticias comentarioss = new ListNoticias();


                List<Comentarios> comentaris = comentarioss.getALLDBS();

                if (na == null|me ==null){
                    System.out.println("esta vacial"+na);
                    System.out.println("esta vacial"+me);
                }else {
                    String idecoment = String.valueOf(i);
                    comentarioss.insertar(new Comentarios(idecoment,na,me));

                }

                for (Comentarios c2:comentaris ){
                    int idcoment = Integer.parseInt(c2.getIdcomentarios());
                    ins=ins+1;
                    if (idcoment==i){
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"comments\">\r\n");
      out.write("                <div class=\"photo-perfil\">\r\n");
      out.write("                    <img src=\"img/fotoPerfilC.jpg\" alt=\"img\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"info-comments\">\r\n");
      out.write("                    <div class=\"header\">\r\n");
      out.write("                        <h4>");
      out.print(c2.getNombre() );
      out.write("</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p>");
      out.print(c2.getComentarios());
      out.write(" </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                    }
                }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <form id=\"formulario\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-data\">\r\n");
      out.write("                <div class=\"photo-input\" >\r\n");
      out.write("                    <div class=\"perfil-photo\">\r\n");
      out.write("                        <img src=\"img/mclovin.jpg\" alt=\"sa\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"text\" name=\"nombre\" placeholder=\"ingrese su nombre\">\r\n");
      out.write("                </div>\r\n");
      out.write("                 <textarea class=\"mensaje\" name=\"mensaje\" id=\"mensaje\" cols=\"30\" rows=\"10\"  placeholder=\"Ingrese su Comentario\"></textarea>\r\n");
      out.write("                <button class=\"btn-comment\"  type=\"submit\" name=\"action\">Comentar</button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <a href=\"Noticias.jsp\" >Regresar<i class=\"fas fa-angle-double-right\"> </i> </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
