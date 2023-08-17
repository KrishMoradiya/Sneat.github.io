<%-- 
    Document   : index
    Created on : Nov 11, 2022, 11:11:33 PM
    Author     : ASUS
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.Med_Mate.getIndexDataClass"%>
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

        <title>Dashboard - Med-Mate | Sneat</title>

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
        <%
            getIndexDataClass getIData = new getIndexDataClass();
        %>
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
                                <div class="col-lg-8 mb-4 order-0">
                                    <div class="card">
                                        <div class="d-flex align-items-end row">
                                            <div class="col-sm-7">
                                                <div class="card-body">
                                                    <h5 class="card-title text-primary">Congratulations <%=request.getSession().getAttribute("UserName").toString()%>! 🎉</h5>
                                                    <p class="mb-4">
                                                        You have done <span class="fw-bold">72%</span> more sales today. Check your new badge in
                                                        your profile.
                                                    </p>
                                                </div>
                                            </div>
                                            <div class="col-sm-5 text-center text-sm-left">
                                                <div class="card-body pb-0 px-0 px-md-4">
                                                    <img
                                                        src="../assets/img/illustrations/man-with-laptop-light.png"
                                                        height="140"
                                                        alt="View Badge User"
                                                        data-app-dark-img="illustrations/man-with-laptop-dark.png"
                                                        data-app-light-img="illustrations/man-with-laptop-light.png"
                                                        />
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 col-md-4 order-1">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-12 col-6 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0">
                                                            <img
                                                                src="../assets/img/icons/unicons/chart-success.png"
                                                                alt="chart success"
                                                                class="rounded"
                                                                />
                                                        </div>
                                                    </div>
                                                    <span class="fw-semibold d-block mb-1"></span>
                                                    <h4 class="card-title mb-2">Total Stock</h4>
                                                    <%
                                                            String stockQuery = "select SUM(MedQt*MedCP) as SUM from medinfo;";
                                                        ResultSet getStock = getIData.getIndexData(stockQuery);
                                                        while(getStock.next())
                                                        {
                                                    %>
                                                    <h3 class="text-success fw-semibold"><i class="bx bx-up-arrow-alt"></i><%=getStock.getString("SUM")%>&nbsp;<i style="font-size:22px" class="fa">&#8377;</i>&nbsp; </h3>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-md-12 col-6 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0">
                                                            <img
                                                                src="../assets/img/icons/unicons/wallet-info.png"
                                                                alt="Credit Card"
                                                                class="rounded"
                                                                />
                                                        </div>
                                                        
                                                    </div>
                                                    
                                                    <h5 class="card-title text-nowrap mb-1">Total Medicine</h5>
                                                    <%
                                                        String totalMedicine = "SELECT count(MedID) as countMedicine from medinfo;";
                                                        ResultSet getTotalMedicine = getIData.getIndexData(totalMedicine);
                                                        while(getTotalMedicine.next())
                                                        {
                                                    %>
                                                    <center><h3 class="text-success fw-semibold" style="padding-top: 7%;"><%=getTotalMedicine.getString("countMedicine")%> </h3>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- Total Revenue -->
                                
                                <!--/ Total Revenue -->
                                <div class="col-12 col-md-8 col-lg-4 order-3 order-md-2">
                                    <div class="row">
                                        <div class="col-6 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0">
                                                            <img src="../assets/img/icons/unicons/paypal.png" alt="Credit Card" class="rounded" />
                                                        </div>
                                                        
                                                    </div>
                                                    
                                                    
                                                    <span class="d-block mb-1">Total Profit</span>
                                                    <%
                                                        String profitQuery = "select SUM((MedQt*MedSP)-(MedQt*MedCP)) as profit,SUM((MedQt*MedCP)) as COST_Price,SUM((MedQt*MedSP)) as Selling_price from medinfo";
                                                        ResultSet getProfitQuery = getIData.getIndexData(profitQuery);
                                                        while(getProfitQuery.next())
                                                        {
                                                    %>
                                                    <h3 class="card-title text-nowrap mb-2"><%=getProfitQuery.getString("profit")%>&nbsp;<i style="font-size:22px" class="fa">&#8377;</i></h3>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-6 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0">
                                                            <img src="../assets/img/icons/unicons/cc-primary.png" alt="Credit Card" class="rounded" />
                                                        </div>
                                                        
                                                    </div>
                                                    <span class="fw-semibold d-block mb-1">Total Pills</span>
                                                    
                                                    <%
                                                        String countPills = "SELECT count(MedID) as countPills from medinfo where MedType='Pills';";
                                                        ResultSet getCountPills = getIData.getIndexData(countPills);
                                                        while(getCountPills.next())
                                                        {
                                                    %>
                                                            <h3 class="card-title text-nowrap mb-2"><%=getCountPills.getString("countPills")%></h3>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-6 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0">
                                                            <img src="../assets/img/icons/unicons/cc-primary.png" alt="Credit Card" class="rounded" />
                                                        </div>
                                                        
                                                    </div>
                                                    <span class="fw-semibold d-block mb-1">Total Capsule</span>
                                                    
                                                    <%
                                                        String countCapsuleQuery = "SELECT count(MedID) as countCapsule from medinfo where MedType='Capsule';";
                                                        ResultSet getCountCapsule = getIData.getIndexData(countCapsuleQuery);
                                                        while(getCountCapsule.next())
                                                        {
                                                    %>
                                                            <h3 class="card-title text-nowrap mb-2"><%=getCountCapsule.getString("countCapsule")%></h3>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </div>
                                        </div>
                                                <div class="col-6 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0">
                                                            <img src="../assets/img/icons/unicons/cc-primary.png" alt="Credit Card" class="rounded" />
                                                        </div>
                                                        
                                                    </div>
                                                    <span class="fw-semibold d-block mb-1">Total Syrup</span>
                                                    
                                                    <%
                                                        String countSyrupQuery = "SELECT count(MedID) as countSyrup from medinfo where MedType='Syrup';";
                                                        ResultSet getCountSyrup = getIData.getIndexData(countSyrupQuery);
                                                        while(getCountSyrup.next())
                                                        {
                                                    %>
                                                            <h3 class="card-title text-nowrap mb-2"><%=getCountSyrup.getString("countSyrup")%></h3>
                                                    <%
                                                        }
                                                    %>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- </div>
                        <div class="row"> -->
                                        
                                    </div>
                                </div>
                            </div>
                            <!--<div class="row">-->
                            <!-- Order Statistics -->

                            <!--/ Order Statistics -->

                            <!-- Expense Overview -->

                            <!--/ Expense Overview -->

                            <!-- Transactions -->

                            <!--/ Transactions -->
                            <!--</div>-->
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
