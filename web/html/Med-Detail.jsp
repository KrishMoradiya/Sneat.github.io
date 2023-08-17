<%@page import="com.Med_Mate.MedClass"%>
<%@page import="javax.servlet.http.*,java.sql.*,com.Med_Mate.DBClass,com.Med_Mate.MedClass;" contentType="text/html" pageEncoding="UTF-8" autoFlush="true" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ft" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

        <title>Med-Mate | Medicine Info</title>

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
                            <!-- Bootstrap Dark Table -->


                            <!--/ Bootstrap Dark Table -->
                            <!-- Bordered Table -->
                            <div class="card">
                                <h5 class="card-header">Medicine detail</h5>
                                <input class="form-control w-50" name="search" style="margin-left: 2%;" type="text" placeholder="Search medicine by Name">
                                <div class="card-body">
                                    <div class="table-responsive text-nowrap">
                                        <form method="POST">
                                            <table id="tblID" class="table table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th><center>Medicine Name</center></th>
                                                        <th><center>Stock Qty</center></th>
                                                        <!--<th><center>Quantity</center></th>-->
                                                        <th><center>Cost Price</center></th>
                                                        <th><center>Selling Price</center></th>
                                                        <th><center>Ex. Date</center></th>
                                                        <th><center>Medicine Type</center></th>
                                                        <th><center>Actions</center></th>
                                                    </tr>
                                                </thead>
                                                <tbody id="myTable">
                                                
                                                    <%                                                    
                                                        MedClass mc = new MedClass();
                                                        ResultSet rs = mc.fetchMedInfo();
                                                        while (rs.next()) {
                                                    %>
                                                    <tr>
                                                        <!--<td><center><input type="hidden" name=""</center></td>-->
                                                        <td><center><%out.print(rs.getString("MedName"));%></center></td>
                                                <td><center><%out.print(rs.getString("inStockQty"));%></center></td>
    <!--                                                    <td><center><%--out.print(rs.getString("MedQt"));--%></center></td>-->
                                                <td><center><%out.print(rs.getString("MedCP"));%></center></td>
                                                <td><center><%out.print(rs.getString("MedSP"));%></center></td>
                                                <td><center><%out.print(rs.getString("MedExDate"));%></center></td>
                                                <td><center><%out.print(rs.getString("MedType"));%></center></td>
                                                <td>
                                                <center>
                                                    <a class="btn-primary btn" href="editMedicineInfo.jsp?MedID=<%out.print(rs.getString("MedID"));%>"
                                                       ><i class="bx bx-edit-alt me-1"></i> Edit</a
                                                    >
                                                    <a class="btn-danger btn" href="deleteServlet?medID=<%out.print(rs.getString("MedID"));%>">
                                                        <!--<input type="hidden" name="medID" value="<%--out.print(rs.getString("MedID"));--%>">-->
                                                        <i class="bx bx-trash me-1"></i>Delete
                                                    </a>
                                                </center>
                                                </td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                                </tbody>
                                            </table>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <!--/ Bordered Table -->

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
<!--        <script type="text/javascript">
            let filter = document.getElementById('search').value.toUpperCase();
            let tbl = document.getElementById('tblID');
            let tr = tbl.getElementsByTagName('tr');
            for(var i=1;i<tr.length;i++){
                let td = tr[i].getElementsByTagName('td')[0].getElementsByTagName('center')[0].innerHTML;
                if(td){
                    let textValue = td.textContent || td.innerHTML;
                    if(textValue.toUpperCase().indexOf(filter) > -1){
                        tr[i].style.display = "";
                    }
                    else{
                        tr[i].style.display = "none";
                    }
                }
 
            }
            
            
        </script>-->
        <!-- / Layout wrapper -->
<!--        <script type="text/javascript">
            $(document).ready(function(){
                $("#search").keyup(function(){
                    search_table($(this).val());
                });
                function search_table(value){
                    $('#tblID tr td center').each(function(){
                        var found = 'false';
                        $(this).each(function(){
                            if($(this).text().toLowerCase().indexOf(value.toLowerCase())>=0)
                            {
                                found = 'true';
                            }
                        });
                        if(found == 'true')
                        {
                            $(this).show();
                        }
                        else{
                            $(this).hide();
                        }
                    });
                }
            });
        </script>-->
<!--<script type="text/javascript">
    $(document).ready(function(){
        $('#search').on("keyup",function(){
            var value = $(this).val().toLowerCase();
            $("#myTable tr td center").filter(function(){
//                $("tr td").filter(function(){
//                    $("td center").filter(function(){
                        $(this).toggle($(this).text().toLowerCase().indexOf(value)>-1);
//                    });
//                });
            });
        });
    });
</script>-->
        <!-- Core JS -->
        <!-- build:js assets/vendor/js/core.js -->
        <script src="../assets/vendor/libs/jquery/jquery.js"></script>
        <script src="../assets/vendor/libs/popper/popper.js"></script>
        <script src="../assets/vendor/js/bootstrap.js"></script>
        <script src="../assets/vendor/js/jquery-migrate-3.4.0.min.js"></script>
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

