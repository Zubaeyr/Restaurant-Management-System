<%@page import="java.sql.*;"  session="true"%>
<html>
<head>
<style type="text/css">
body
{
background: black;

}
.header {
	width: 1200px;
	height: 110px;
	-moz-border-radius:25px;
	margin: auto;
	background:url("new/red_bg.jpg") repeat-x;
	color: #ffffff;
	text-align:LEFT;
	text-shadow:10px 10px 3px #181818;
	font-size:40px;
	padding:20px;
	//font-weight:bold;
	font-family:free serif;
	font-variant:small-caps;
}
.icon{
	position: absolute;
	width: 100px;
	margin:auto;
	height: 50px;
	left: 1150px;
	top:120px;
	font-size:14px;
}
.font
{
font-size:14px;
color:red;
}
.td1
{
text-align:justify;
padding-left:130px;
padding-top:25px;
width:600px;
}
.td2
{
position:absolute;
text-align:left;
padding-left:30px;
left:900px;
top:180px;
width:250px;
color:white;
}
.align
{
text-align="right";
}

a.icon1:link,a.icon1:visited {color:D8D8D8;text-decoration:none;font-weight:bold;font-size:13px;text-align:"center";}  
a.icon1:hover{color:#ffffff;text-decoration:underline;}

a:link,a:visited {color:#c8c8c8;text-decoration:none;font-size:13px;}  
a:hover{color:#ffffff;text-decoration:underline;}
h5{color:#e80000;text-decoration:underline;}
</style>

<script type="text/javascript">
function doJob()
{
  var cno=document.getElementById("cno");
  var first=document.getElementById("first");
  var nn=document.getElementById("nn");
  var age=document.getElementById("age");
  var oct=document.getElementById("oct");
  var ct=document.getElementById("ct");
  var ad=document.getElementById("ad");
  var sub=document.getElementById("submit");
   
  if(cno.value == "" || first.value == "" || nn.value =="" || age.value =="" || oct.value == "" || ct.value == "" || ad.value =="")
	{
		alert("Fill all the fields");sub.innerHTML=("");return false;
	}

}
</script>


</head>
<body>
<div class="header">
		<p>Crime Management System</>
<div class="icon"><a class="icon1" href="home_a.html">Home |</a>
<a class="icon1" href="logout.jsp">Logout</a></div>
</div>
<table align="center" height=70%>
<tr class="font">
<td class="td1"><p><table class="font" >
<form action="criminalregister_aac.jsp" method="post">
<%
try
{
 String cno=document.getElementById("cno");
  String first=document.getElementById("first");
  String nn=document.getElementById("nn");
  String age=document.getElementById("age");
  String oct=document.getElementById("oct");
  String ct=document.getElementById("ct");
  String ad=document.getElementById("ad");
String most=request.getParameter("select2");
Class.forName("com.mysql.jdbc.Driver").NewInstance;
Connection con1= DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles","root","");
Statement st1 = con1.CreateStatement();
st.executeUpdate("insert into criminalregister values('" + cno + "','" + first + "','"+ nn +"','"+ age +"','"+ oct +"','"+ ct +"','"+ ad +"','"+ most +"')");
out.println("Successfully Saved");
catch(Exception e)
{
}
%>

<tr><td align="right" height="53">Criminal No.:</td><td><input type ="text" name="cno" id="cno"></td></tr>
<tr><td align="right" height="53">Name:</td><td><input type ="text" name="first" id="first"></td></tr>
<tr><td align="right"height="51">Nick Name:</td><td><input type="text" name="nn" id="nn"></td></tr>
<tr><td align="right"height="55">Age:</td><td><input type ="text" name="age" id="age"></td></tr>
<tr><td align="right"height="53">Occuation:</td><td><input type ="text" name="oct" id="oct"></td></tr>
<tr><td align="right"height="54" >Crime Type:</td><td><input type="text"  name="ct" id="ct"></tr>
<tr><td align="right"height="52">Address:</td><td><textarea name="text"rows="3" height="2"  name="ad" id="ad"></textarea></td></tr>
<tr>
    <td height="42"><div align="right">Most Wanted:</div></td>
    <td>
  
      
      <select name="select2">
	  <option>Yes</option>
	  <option>No</option>
      </select>
      </td>
  </tr>
<tr>
<center><td align="right" height="52"><input type = "submit" value="Save" id="submit" onclick=" return doJob()"></td></center>
<center><td><input type = "reset" value="Cancel"></td></center></tr>
<tr>
    <td height="52" colspan="2">
 
      <div align="center"></div>
      <div align="center"><a href="umLargeUpload.jsp">click here to upload photo</a>      
                
      </div></td>
  </tr>
</table>
</form>
</td>
</tr>
</table>
<div class="td2">
<ul>
						<li>
				<h5>New Additions</h5>
				<ul>


					<li><a href="hotnews_a.html">Hot News </a></li>
					<li><a href="hotnews_areport.jsp">View Hot News </a></li>
					<li><a href="message_areport.jsp">View Message </a></li>
					<li><a href="mostwanted_a.html">Most Wanted </a></li>
					<li><a href="mostwanted_areport.jsp">View/Delete MostWanted </a></li>

					<li><a href="missingperson_a.html">Missing Persons </a></li>
					<li><a href="missingperson_areport.jsp">View/Delete Missing Persons </a></li>
					<li><a href="criminalregister_a.html">Criminal Register </a></li>
					<li><a href="criminalregister_areport.jsp">View/Delete Criminal Register </a></li>
					<li><a href="complaint_a.jsp">View Complaints </a></li>					
					<li><a href="crime_a.jsp">View CrimeReports </a></li>
					<li><a href="reply_a.html">Reply</a></li>
					<li><a href="reply_areport.jsp">All Replies</a></li>
					<li><a href="prisoner's reg_a.html">Prisoner's Register </a></li>
					<li><a href="prisoner's reg_areport.jsp">View Prisoner's Report </a></li>
					<li><a href="fir_a.html">FIR</a></li>
					<li><a href="fir_areport.jsp">FIR Report</a></li>
					<li><a href="userdetails_areport.jsp">View User Details </a></li>
					<li><a href="chargesheet_a.html">Chargesheet </a></li>
					<li><a href="chargesheet_areport.jsp">View/Delete Chargesheet </a></li>
					<li><a href="history_a.jsp">History</a></li>
				</ul>
			</li>
			<li>

				<h5>Account Settings </h5>
				<ul>
					<li><a href="changepass_a.html">Change Password </a></li>
					
				</ul>
			</li>

		</ul>
</div>
<div align="center">
<img src="new/footer.jpg"/>	
</div>
</body>
</html>
