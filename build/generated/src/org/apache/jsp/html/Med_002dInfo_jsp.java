package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Med_002dInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/html/aside_Header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_redirect_url_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Medicine Info</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Menu -->\n");
      out.write("        ");

            session = request.getSession();
            if (session.getAttribute("UserName") == null) {
        
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_redirect_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");

            }
  //else if(session.getAttribute("UserName") != null)
            //response.sendRedirect("login.jsp");
        
      out.write("\n");
      out.write("        <aside id=\"layout-menu\" class=\"layout-menu menu-vertical menu bg-menu-theme\">\n");
      out.write("          <div class=\"app-brand demo\">\n");
      out.write("            <a href=\"index.jsp\" class=\"app-brand-link\">\n");
      out.write("              <span class=\"app-brand-logo demo\">\n");
      out.write("                <svg\n");
      out.write("                  width=\"25\"\n");
      out.write("                  viewBox=\"0 0 25 42\"\n");
      out.write("                  version=\"1.1\"\n");
      out.write("                  xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                  xmlns:xlink=\"http://www.w3.org/1999/xlink\"\n");
      out.write("                >\n");
      out.write("                  <defs>\n");
      out.write("                    <path\n");
      out.write("                      d=\"M13.7918663,0.358365126 L3.39788168,7.44174259 C0.566865006,9.69408886 -0.379795268,12.4788597 0.557900856,15.7960551 C0.68998853,16.2305145 1.09562888,17.7872135 3.12357076,19.2293357 C3.8146334,19.7207684 5.32369333,20.3834223 7.65075054,21.2172976 L7.59773219,21.2525164 L2.63468769,24.5493413 C0.445452254,26.3002124 0.0884951797,28.5083815 1.56381646,31.1738486 C2.83770406,32.8170431 5.20850219,33.2640127 7.09180128,32.5391577 C8.347334,32.0559211 11.4559176,30.0011079 16.4175519,26.3747182 C18.0338572,24.4997857 18.6973423,22.4544883 18.4080071,20.2388261 C17.963753,17.5346866 16.1776345,15.5799961 13.0496516,14.3747546 L10.9194936,13.4715819 L18.6192054,7.984237 L13.7918663,0.358365126 Z\"\n");
      out.write("                      id=\"path-1\"\n");
      out.write("                    ></path>\n");
      out.write("                    <path\n");
      out.write("                      d=\"M5.47320593,6.00457225 C4.05321814,8.216144 4.36334763,10.0722806 6.40359441,11.5729822 C8.61520715,12.571656 10.0999176,13.2171421 10.8577257,13.5094407 L15.5088241,14.433041 L18.6192054,7.984237 C15.5364148,3.11535317 13.9273018,0.573395879 13.7918663,0.358365126 C13.5790555,0.511491653 10.8061687,2.3935607 5.47320593,6.00457225 Z\"\n");
      out.write("                      id=\"path-3\"\n");
      out.write("                    ></path>\n");
      out.write("                    <path\n");
      out.write("                      d=\"M7.50063644,21.2294429 L12.3234468,23.3159332 C14.1688022,24.7579751 14.397098,26.4880487 13.008334,28.506154 C11.6195701,30.5242593 10.3099883,31.790241 9.07958868,32.3040991 C5.78142938,33.4346997 4.13234973,34 4.13234973,34 C4.13234973,34 2.75489982,33.0538207 2.37032616e-14,31.1614621 C-0.55822714,27.8186216 -0.55822714,26.0572515 -4.05231404e-15,25.8773518 C0.83734071,25.6075023 2.77988457,22.8248993 3.3049379,22.52991 C3.65497346,22.3332504 5.05353963,21.8997614 7.50063644,21.2294429 Z\"\n");
      out.write("                      id=\"path-4\"\n");
      out.write("                    ></path>\n");
      out.write("                    <path\n");
      out.write("                      d=\"M20.6,7.13333333 L25.6,13.8 C26.2627417,14.6836556 26.0836556,15.9372583 25.2,16.6 C24.8538077,16.8596443 24.4327404,17 24,17 L14,17 C12.8954305,17 12,16.1045695 12,15 C12,14.5672596 12.1403557,14.1461923 12.4,13.8 L17.4,7.13333333 C18.0627417,6.24967773 19.3163444,6.07059163 20.2,6.73333333 C20.3516113,6.84704183 20.4862915,6.981722 20.6,7.13333333 Z\"\n");
      out.write("                      id=\"path-5\"\n");
      out.write("                    ></path>\n");
      out.write("                  </defs>\n");
      out.write("                  <g id=\"g-app-brand\" stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\">\n");
      out.write("                    <g id=\"Brand-Logo\" transform=\"translate(-27.000000, -15.000000)\">\n");
      out.write("                      <g id=\"Icon\" transform=\"translate(27.000000, 15.000000)\">\n");
      out.write("                        <g id=\"Mask\" transform=\"translate(0.000000, 8.000000)\">\n");
      out.write("                          <mask id=\"mask-2\" fill=\"white\">\n");
      out.write("                            <use xlink:href=\"#path-1\"></use>\n");
      out.write("                          </mask>\n");
      out.write("                          <use fill=\"#696cff\" xlink:href=\"#path-1\"></use>\n");
      out.write("                          <g id=\"Path-3\" mask=\"url(#mask-2)\">\n");
      out.write("                            <use fill=\"#696cff\" xlink:href=\"#path-3\"></use>\n");
      out.write("                            <use fill-opacity=\"0.2\" fill=\"#FFFFFF\" xlink:href=\"#path-3\"></use>\n");
      out.write("                          </g>\n");
      out.write("                          <g id=\"Path-4\" mask=\"url(#mask-2)\">\n");
      out.write("                            <use fill=\"#696cff\" xlink:href=\"#path-4\"></use>\n");
      out.write("                            <use fill-opacity=\"0.2\" fill=\"#FFFFFF\" xlink:href=\"#path-4\"></use>\n");
      out.write("                          </g>\n");
      out.write("                        </g>\n");
      out.write("                        <g\n");
      out.write("                          id=\"Triangle\"\n");
      out.write("                          transform=\"translate(19.000000, 11.000000) rotate(-300.000000) translate(-19.000000, -11.000000) \"\n");
      out.write("                        >\n");
      out.write("                          <use fill=\"#696cff\" xlink:href=\"#path-5\"></use>\n");
      out.write("                          <use fill-opacity=\"0.2\" fill=\"#FFFFFF\" xlink:href=\"#path-5\"></use>\n");
      out.write("                        </g>\n");
      out.write("                      </g>\n");
      out.write("                    </g>\n");
      out.write("                  </g>\n");
      out.write("                </svg>\n");
      out.write("              </span>\n");
      out.write("              <span class=\"app-brand-text demo menu-text fw-bolder ms-2\">Sneat</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"layout-menu-toggle menu-link text-large ms-auto d-block d-xl-none\">\n");
      out.write("              <i class=\"bx bx-chevron-left bx-sm align-middle\"></i>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"menu-inner-shadow\"></div>\n");
      out.write("\n");
      out.write("          <ul class=\"menu-inner py-1\">\n");
      out.write("            <!-- Dashboard -->\n");
      out.write("            <li class=\"menu-item active\">\n");
      out.write("              <a href=\"index.jsp\" class=\"menu-link\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-home-circle\"></i>\n");
      out.write("                <div data-i18n=\"Analytics\">Dashboard</div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Layouts -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"menu-header small text-uppercase\">\n");
      out.write("              <span class=\"menu-header-text\">Pages</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"javascript:void(0);\" class=\"menu-link menu-toggle\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-lock-open-alt\"></i>\n");
      out.write("                <div data-i18n=\"Authentications\">Authentications</div>\n");
      out.write("              </a>\n");
      out.write("              <ul class=\"menu-sub\">\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"login.jsp\" class=\"menu-link\" target=\"_blank\">\n");
      out.write("                    <div data-i18n=\"Basic\">Login</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"Register.jsp\" class=\"menu-link\" target=\"_blank\">\n");
      out.write("                    <div data-i18n=\"Basic\">Register</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"auth-forgot-password-basic.html\" class=\"menu-link\" target=\"_blank\">\n");
      out.write("                    <div data-i18n=\"Basic\">Forgot Password</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"javascript:void(0);\" class=\"menu-link menu-toggle\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-cube-alt\"></i>\n");
      out.write("                <div data-i18n=\"Misc\">Misc</div>\n");
      out.write("              </a>\n");
      out.write("              <ul class=\"menu-sub\">\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"pages-misc-error.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Error\">Error</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"pages-misc-under-maintenance.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Under Maintenance\">Under Maintenance</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <!-- Components -->\n");
      out.write("            <li class=\"menu-header small text-uppercase\"><span class=\"menu-header-text\">Components</span></li>\n");
      out.write("            <!-- Cards -->\n");
      out.write("            <!-- User interface -->\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"javascript:void(0)\" class=\"menu-link menu-toggle\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-box\"></i>\n");
      out.write("                <div data-i18n=\"User interface\">User interface</div>\n");
      out.write("              </a>\n");
      out.write("              <ul class=\"menu-sub\">\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-accordion.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Accordion\">Accordion</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-alerts.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Alerts\">Alerts</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-badges.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Badges\">Badges</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-buttons.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Buttons\">Buttons</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-carousel.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Carousel\">Carousel</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-collapse.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Collapse\">Collapse</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-dropdowns.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Dropdowns\">Dropdowns</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-footer.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Footer\">Footer</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-list-groups.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"List Groups\">List groups</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-modals.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Modals\">Modals</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-navbar.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Navbar\">Navbar</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-offcanvas.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Offcanvas\">Offcanvas</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-pagination-breadcrumbs.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Pagination &amp; Breadcrumbs\">Pagination &amp; Breadcrumbs</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-progress.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Progress\">Progress</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-spinners.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Spinners\">Spinners</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-tabs-pills.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Tabs &amp; Pills\">Tabs &amp; Pills</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-toasts.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Toasts\">Toasts</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-tooltips-popovers.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Tooltips & Popovers\">Tooltips &amp; popovers</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"ui-typography.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Typography\">Typography</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Extended components -->\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"javascript:void(0)\" class=\"menu-link menu-toggle\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-copy\"></i>\n");
      out.write("                <div data-i18n=\"Extended UI\">Extended UI</div>\n");
      out.write("              </a>\n");
      out.write("              <ul class=\"menu-sub\">\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"extended-ui-perfect-scrollbar.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Perfect Scrollbar\">Perfect scrollbar</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"extended-ui-text-divider.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Text Divider\">Text Divider</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"icons-boxicons.html\" class=\"menu-link\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-crown\"></i>\n");
      out.write("                <div data-i18n=\"Boxicons\">Boxicons</div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Forms & Tables -->\n");
      out.write("            <li class=\"menu-header small text-uppercase\"><span class=\"menu-header-text\">Forms &amp; Tables</span></li>\n");
      out.write("            <!-- Forms -->\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"javascript:void(0);\" class=\"menu-link menu-toggle\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-detail\"></i>\n");
      out.write("                <div data-i18n=\"Form Elements\">Form Elements</div>\n");
      out.write("              </a>\n");
      out.write("              <ul class=\"menu-sub\">\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"forms-basic-inputs.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Basic Inputs\">Basic Inputs</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"forms-input-groups.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Input groups\">Input groups</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"javascript:void(0);\" class=\"menu-link menu-toggle\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-detail\"></i>\n");
      out.write("                <div data-i18n=\"Form Layouts\">Form Layouts</div>\n");
      out.write("              </a>\n");
      out.write("              <ul class=\"menu-sub\">\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"form-layouts-vertical.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Vertical Form\">Vertical Form</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item\">\n");
      out.write("                  <a href=\"form-layouts-horizontal.html\" class=\"menu-link\">\n");
      out.write("                    <div data-i18n=\"Horizontal Form\">Horizontal Form</div>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <!-- Tables -->\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a href=\"tables-basic.html\" class=\"menu-link\">\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-table\"></i>\n");
      out.write("                <div data-i18n=\"Tables\">Tables</div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <!-- Misc -->\n");
      out.write("            <li class=\"menu-header small text-uppercase\"><span class=\"menu-header-text\">Misc</span></li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a\n");
      out.write("                href=\"https://github.com/themeselection/sneat-html-admin-template-free/issues\"\n");
      out.write("                target=\"_blank\"\n");
      out.write("                class=\"menu-link\"\n");
      out.write("              >\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-support\"></i>\n");
      out.write("                <div data-i18n=\"Support\">Support</div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"menu-item\">\n");
      out.write("              <a\n");
      out.write("                href=\"https://themeselection.com/demo/sneat-bootstrap-html-admin-template/documentation/\"\n");
      out.write("                target=\"_blank\"\n");
      out.write("                class=\"menu-link\"\n");
      out.write("              >\n");
      out.write("                <i class=\"menu-icon tf-icons bx bx-file\"></i>\n");
      out.write("                <div data-i18n=\"Documentation\">Documentation</div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </aside>\n");
      out.write("        <!-- / Menu -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_redirect_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent(null);
    _jspx_th_c_redirect_0.setUrl("login.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }
}
