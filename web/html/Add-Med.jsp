<%-- 
    Document   : index
    Created on : Nov 11, 2022, 11:11:33 PM
    Author     : ASUS
--%>

<%@page import="javax.servlet.http.*;" contentType="text/html" pageEncoding="UTF-8" autoFlush="true" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html
    lang="en"
    class="light-style layout-menu-fixed"
    dir="ltr"
    data-theme="theme-default"
    data-assets-path="../assets/"
    data-template="vertical-menu-template-free"
    >
    <head>
        
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"
            />

        <title>Dashboard - Analytics | Sneat - Bootstrap 5 HTML Admin Template - Pro</title>

        <meta name="description" content="" />

        <!-- Favicon -->
        <link rel="icon" type="image/x-icon" href="../assets/img/favicon/favicon.ico" />

        <!-- Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
            rel="stylesheet"
            />

        <!-- Icons. Uncomment required icon fonts -->
        <link rel="stylesheet" href="../assets/vendor/fonts/boxicons.css" />

        <!-- Core CSS -->
        <link rel="stylesheet" href="../assets/vendor/css/core.css" class="template-customizer-core-css" />
        <link rel="stylesheet" href="../assets/vendor/css/theme-default.css" class="template-customizer-theme-css" />
        <link rel="stylesheet" href="../assets/css/demo.css" />

        <!-- Vendors CSS -->
        <link rel="stylesheet" href="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css" />

        <link rel="stylesheet" href="../assets/vendor/libs/apex-charts/apex-charts.css" />

        <!-- Page CSS -->

        <!-- Helpers -->
        <script src="../assets/vendor/js/helpers.js"></script>

        <!--! Template customizer & Theme config files MUST be included after core stylesheets and helpers.js in the <head> section -->
        <!--? Config:  Mandatory theme config file contain global vars & default theme options, Set your preferred theme option in this file.  -->
        <script src="../assets/js/config.js"></script>
    </head>

    <body>

        <!-- Layout wrapper -->
        <div class="layout-wrapper layout-content-navbar">
            <div class="layout-container">
                <!-- Aside Header Paste here -->
                <%@ include file="aside_Header.jsp" %>
                <!-- Layout container -->
                <div class="layout-page">
                    <!-- Navbar -->

                    <%@include file="navbar.jsp" %>

                    <!-- / Navbar -->

                    <!-- Content wrapper -->
                    <div class="content-wrapper">
                        <!-- Content -->

                        <div class="container-xxl flex-grow-1 container-p-y">
                            <div class="row">
                                <div class="col-xl">
                                    <div class="card mb-4">
                                        <div class="card-header d-flex justify-content-between align-items-center">
                                            <h5 class="mb-0">Add Medicine info</h5>
                                            <small class="text-muted float-end"></small>
                                        </div>
                                        <div class="card-body">
                                            <form action="addMedicine" method="POST">
                                                <div class="mb-3">
                                                    <label class="form-label" for="basic-default-fullname">Medicine Name</label>
                                                    <input type="text" name="medName" class="form-control" id="basic-default-fullname" placeholder="Medicine Name" />
                                                </div>
                                                <div class="mb-3">
                                                    <label class="form-label" for="basic-default-fullname">Quantity (in strip)</label>
                                                    <input type="text" name="quantity" class="form-control" id="basic-default-fullname" placeholder="Medicine Quantity" />
                                                </div>
                                                <div class="mb-3">
                                                    <label class="form-label" for="basic-default-fullname">Cost Price</label>
                                                    <input type="text" name="cprice" class="form-control" id="basic-default-fullname" placeholder="Medicine Cost Price" />
                                                </div>
                                                <div class="mb-3">
                                                    <label class="form-label" for="basic-default-fullname">Selling Price</label>
                                                    <input type="text" name="sprice" class="form-control" id="basic-default-fullname" placeholder="Medicine Selling Price" />
                                                </div>
                                                <div class="mb-3">
                                                    <label class="form-label" for="basic-default-fullname">Expiry Date</label>
                                                    <input type="date" name="exDate" class="form-control" id="basic-default-fullname"/>
                                                </div>
                                                <div class="mb-3">
                                                    <label class="form-label" for="basic-default-fullname">Medicine Type</label>
                                                    <select name="medType" class="form-select form-control">
                                                        <option value="Pills">Pills</option>
                                                        <option value="Syrup">Syrup</option>
                                                        <option value="Capsule">Capsule</option>
                                                    </select>
                                                </div>
                                                <input type="submit" class="btn btn-primary" value="Save">
                                            </form>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <!-- / Content -->

                        <!-- Footer -->
                        <%@include file="footer.jsp" %>
                        <!-- / Footer -->

                        <div class="content-backdrop fade"></div>
                    </div>
                    <!-- Content wrapper -->
                </div>
                <!-- / Layout page -->
            </div>

            <!-- Overlay -->
            <div class="layout-overlay layout-menu-toggle"></div>
        </div>
        <!-- / Layout wrapper -->


        <!-- Core JS -->
        <!-- build:js assets/vendor/js/core.js -->
        <script src="../assets/vendor/libs/jquery/jquery.js"></script>
        <script src="../assets/vendor/libs/popper/popper.js"></script>
        <script src="../assets/vendor/js/bootstrap.js"></script>
        <script src="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js"></script>

        <script src="../assets/vendor/js/menu.js"></script>
        <!-- endbuild -->

        <!-- Vendors JS -->
        <script src="../assets/vendor/libs/apex-charts/apexcharts.js"></script>

        <!-- Main JS -->
        <script src="../assets/js/main.js"></script>

        <!-- Page JS -->
        <script src="../assets/js/dashboards-analytics.js"></script>

        <!-- Place this tag in your head or just before your close body tag. -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
    </body>
</html>
