<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleClaimServiceProxyid" scope="session" class="com.mitchell.www.examples.claim.ClaimServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleClaimServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleClaimServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleClaimServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mitchell.www.examples.claim.ClaimService getClaimService10mtemp = sampleClaimServiceProxyid.getClaimService();
if(getClaimService10mtemp == null){
%>
<%=getClaimService10mtemp %>
<%
}else{
        if(getClaimService10mtemp!= null){
        String tempreturnp11 = getClaimService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String claimId_2id=  request.getParameter("claimId42");
            java.lang.String claimId_2idTemp = null;
        if(!claimId_2id.equals("")){
         claimId_2idTemp  = claimId_2id;
        }
        %>
        <jsp:useBean id="com1mitchell1www1examples1claim1GetClaimByClaimIdRequest_1id" scope="session" class="com.mitchell.www.examples.claim.GetClaimByClaimIdRequest" />
        <%
        com1mitchell1www1examples1claim1GetClaimByClaimIdRequest_1id.setClaimId(claimId_2idTemp);
        com.mitchell.www.examples.claim.GetClaimByClaimIdResponse getClaimByClaimId13mtemp = sampleClaimServiceProxyid.getClaimByClaimId(com1mitchell1www1examples1claim1GetClaimByClaimIdRequest_1id);
if(getClaimByClaimId13mtemp == null){
%>
<%=getClaimByClaimId13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">claimResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claimNumber:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
java.lang.String typeclaimNumber18 = tebece0.getClaimNumber();
        String tempResultclaimNumber18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaimNumber18));
        %>
        <%= tempResultclaimNumber18 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
java.lang.String typestatus20 = tebece0.getStatus();
        String tempResultstatus20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus20));
        %>
        <%= tempResultstatus20 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claimantFirstName:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
java.lang.String typeclaimantFirstName22 = tebece0.getClaimantFirstName();
        String tempResultclaimantFirstName22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaimantFirstName22));
        %>
        <%= tempResultclaimantFirstName22 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">assignedAdjusterID:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
java.lang.Long typeassignedAdjusterID24 = tebece0.getAssignedAdjusterID();
        String tempResultassignedAdjusterID24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeassignedAdjusterID24));
        %>
        <%= tempResultassignedAdjusterID24 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lossInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">lossDescription:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.LossInfoType tebece1=tebece0.getLossInfo();
if(tebece1 != null){
java.lang.String typelossDescription28 = tebece1.getLossDescription();
        String tempResultlossDescription28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelossDescription28));
        %>
        <%= tempResultlossDescription28 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">reportedDate:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.LossInfoType tebece1=tebece0.getLossInfo();
if(tebece1 != null){
java.util.Calendar typereportedDate30 = tebece1.getReportedDate();
        java.text.DateFormat dateFormatreportedDate30 = java.text.DateFormat.getDateInstance();
        java.util.Date datereportedDate30 = typereportedDate30.getTime();
        String tempResultreportedDate30 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatreportedDate30.format(datereportedDate30));
        %>
        <%= tempResultreportedDate30 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">causeOfLoss:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.LossInfoType tebece1=tebece0.getLossInfo();
if(tebece1 != null){
java.lang.String typecauseOfLoss32 = tebece1.getCauseOfLoss();
        String tempResultcauseOfLoss32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecauseOfLoss32));
        %>
        <%= tempResultcauseOfLoss32 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">vehicles:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.VehicleInfoType[] typevehicles34 = tebece0.getVehicles();
        String tempvehicles34 = null;
        if(typevehicles34 != null){
        java.util.List listvehicles34= java.util.Arrays.asList(typevehicles34);
        tempvehicles34 = listvehicles34.toString();
        }
        %>
        <%=tempvehicles34%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lossDate:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
java.util.Calendar typelossDate36 = tebece0.getLossDate();
        java.text.DateFormat dateFormatlossDate36 = java.text.DateFormat.getDateInstance();
        java.util.Date datelossDate36 = typelossDate36.getTime();
        String tempResultlossDate36 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatlossDate36.format(datelossDate36));
        %>
        <%= tempResultlossDate36 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claimantLastName:</TD>
<TD>
<%
if(getClaimByClaimId13mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=getClaimByClaimId13mtemp.getClaimResponse();
if(tebece0 != null){
java.lang.String typeclaimantLastName38 = tebece0.getClaimantLastName();
        String tempResultclaimantLastName38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaimantLastName38));
        %>
        <%= tempResultclaimantLastName38 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 44:
        gotMethod = true;
        String startDate_4id=  request.getParameter("startDate49");
            java.util.Calendar startDate_4idTemp = null;
        if(!startDate_4id.equals("")){
        java.text.DateFormat dateFormatstartDate49 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempstartDate49  = dateFormatstartDate49.parse(startDate_4id);
         startDate_4idTemp = new java.util.GregorianCalendar();
        startDate_4idTemp.setTime(dateTempstartDate49);
        }
        String endDate_5id=  request.getParameter("endDate51");
            java.util.Calendar endDate_5idTemp = null;
        if(!endDate_5id.equals("")){
        java.text.DateFormat dateFormatendDate51 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempendDate51  = dateFormatendDate51.parse(endDate_5id);
         endDate_5idTemp = new java.util.GregorianCalendar();
        endDate_5idTemp.setTime(dateTempendDate51);
        }
        %>
        <jsp:useBean id="com1mitchell1www1examples1claim1GetClaimsListByLossDateRanageRequest_3id" scope="session" class="com.mitchell.www.examples.claim.GetClaimsListByLossDateRanageRequest" />
        <%
        com1mitchell1www1examples1claim1GetClaimsListByLossDateRanageRequest_3id.setStartDate(startDate_4idTemp);
        com1mitchell1www1examples1claim1GetClaimsListByLossDateRanageRequest_3id.setEndDate(endDate_5idTemp);
        com.mitchell.www.examples.claim.MitchellClaimType[] getClaimsListByLossDateRange44mtemp = sampleClaimServiceProxyid.getClaimsListByLossDateRange(com1mitchell1www1examples1claim1GetClaimsListByLossDateRanageRequest_3id);
if(getClaimsListByLossDateRange44mtemp == null){
%>
<%=getClaimsListByLossDateRange44mtemp %>
<%
}else{
        String tempreturnp45 = null;
        if(getClaimsListByLossDateRange44mtemp != null){
        java.util.List listreturnp45= java.util.Arrays.asList(getClaimsListByLossDateRange44mtemp);
        tempreturnp45 = listreturnp45.toString();
        }
        %>
        <%=tempreturnp45%>
        <%
}
break;
case 53:
        gotMethod = true;
        String assignedAdjusterID_7id=  request.getParameter("assignedAdjusterID60");
            java.lang.Long assignedAdjusterID_7idTemp = null;
        if(!assignedAdjusterID_7id.equals("")){
         assignedAdjusterID_7idTemp  = java.lang.Long.valueOf(assignedAdjusterID_7id);
        }
        String claimNumber_8id=  request.getParameter("claimNumber62");
            java.lang.String claimNumber_8idTemp = null;
        if(!claimNumber_8id.equals("")){
         claimNumber_8idTemp  = claimNumber_8id;
        }
        %>
        <jsp:useBean id="com1mitchell1www1examples1claim1MitchellClaimUpdateType_6id" scope="session" class="com.mitchell.www.examples.claim.MitchellClaimUpdateType" />
        <%
        com1mitchell1www1examples1claim1MitchellClaimUpdateType_6id.setAssignedAdjusterID(assignedAdjusterID_7idTemp);
        com1mitchell1www1examples1claim1MitchellClaimUpdateType_6id.setClaimNumber(claimNumber_8idTemp);
        com.mitchell.www.examples.claim.UpDateClaimResponse upDateClaim53mtemp = sampleClaimServiceProxyid.upDateClaim(com1mitchell1www1examples1claim1MitchellClaimUpdateType_6id);
if(upDateClaim53mtemp == null){
%>
<%=upDateClaim53mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">isClaimUpdated:</TD>
<TD>
<%
if(upDateClaim53mtemp != null){
%>
<%=upDateClaim53mtemp.isIsClaimUpdated()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 64:
        gotMethod = true;
        String claimNumber_10id=  request.getParameter("claimNumber93");
            java.lang.String claimNumber_10idTemp = null;
        if(!claimNumber_10id.equals("")){
         claimNumber_10idTemp  = claimNumber_10id;
        }
        String status_11id=  request.getParameter("status95");
            java.lang.String status_11idTemp = null;
        if(!status_11id.equals("")){
         status_11idTemp  = status_11id;
        }
        String claimantFirstName_12id=  request.getParameter("claimantFirstName97");
            java.lang.String claimantFirstName_12idTemp = null;
        if(!claimantFirstName_12id.equals("")){
         claimantFirstName_12idTemp  = claimantFirstName_12id;
        }
        String assignedAdjusterID_13id=  request.getParameter("assignedAdjusterID99");
            java.lang.Long assignedAdjusterID_13idTemp = null;
        if(!assignedAdjusterID_13id.equals("")){
         assignedAdjusterID_13idTemp  = java.lang.Long.valueOf(assignedAdjusterID_13id);
        }
        String lossDescription_15id=  request.getParameter("lossDescription103");
            java.lang.String lossDescription_15idTemp = null;
        if(!lossDescription_15id.equals("")){
         lossDescription_15idTemp  = lossDescription_15id;
        }
        String reportedDate_16id=  request.getParameter("reportedDate105");
            java.util.Calendar reportedDate_16idTemp = null;
        if(!reportedDate_16id.equals("")){
        java.text.DateFormat dateFormatreportedDate105 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempreportedDate105  = dateFormatreportedDate105.parse(reportedDate_16id);
         reportedDate_16idTemp = new java.util.GregorianCalendar();
        reportedDate_16idTemp.setTime(dateTempreportedDate105);
        }
        String causeOfLoss_17id=  request.getParameter("causeOfLoss107");
            java.lang.String causeOfLoss_17idTemp = null;
        if(!causeOfLoss_17id.equals("")){
         causeOfLoss_17idTemp  = causeOfLoss_17id;
        }
        %>
        <jsp:useBean id="com1mitchell1www1examples1claim1LossInfoType_14id" scope="session" class="com.mitchell.www.examples.claim.LossInfoType" />
        <%
        com1mitchell1www1examples1claim1LossInfoType_14id.setLossDescription(lossDescription_15idTemp);
        com1mitchell1www1examples1claim1LossInfoType_14id.setReportedDate(reportedDate_16idTemp);
        com1mitchell1www1examples1claim1LossInfoType_14id.setCauseOfLoss(causeOfLoss_17idTemp);
        String lossDate_18id=  request.getParameter("lossDate109");
            java.util.Calendar lossDate_18idTemp = null;
        if(!lossDate_18id.equals("")){
        java.text.DateFormat dateFormatlossDate109 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTemplossDate109  = dateFormatlossDate109.parse(lossDate_18id);
         lossDate_18idTemp = new java.util.GregorianCalendar();
        lossDate_18idTemp.setTime(dateTemplossDate109);
        }
        String claimantLastName_19id=  request.getParameter("claimantLastName111");
            java.lang.String claimantLastName_19idTemp = null;
        if(!claimantLastName_19id.equals("")){
         claimantLastName_19idTemp  = claimantLastName_19id;
        }
        %>
        <jsp:useBean id="com1mitchell1www1examples1claim1MitchellClaimType_9id" scope="session" class="com.mitchell.www.examples.claim.MitchellClaimType" />
        <%
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setClaimNumber(claimNumber_10idTemp);
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setStatus(status_11idTemp);
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setClaimantFirstName(claimantFirstName_12idTemp);
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setAssignedAdjusterID(assignedAdjusterID_13idTemp);
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setLossInfo(com1mitchell1www1examples1claim1LossInfoType_14id);
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setLossDate(lossDate_18idTemp);
        com1mitchell1www1examples1claim1MitchellClaimType_9id.setClaimantLastName(claimantLastName_19idTemp);
        com.mitchell.www.examples.claim.CreateClaimResponse createClaim64mtemp = sampleClaimServiceProxyid.createClaim(com1mitchell1www1examples1claim1MitchellClaimType_9id);
if(createClaim64mtemp == null){
%>
<%=createClaim64mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">claimCreatedResponse:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claimNumber:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
java.lang.String typeclaimNumber69 = tebece0.getClaimNumber();
        String tempResultclaimNumber69 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaimNumber69));
        %>
        <%= tempResultclaimNumber69 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">status:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
java.lang.String typestatus71 = tebece0.getStatus();
        String tempResultstatus71 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus71));
        %>
        <%= tempResultstatus71 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claimantFirstName:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
java.lang.String typeclaimantFirstName73 = tebece0.getClaimantFirstName();
        String tempResultclaimantFirstName73 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaimantFirstName73));
        %>
        <%= tempResultclaimantFirstName73 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">assignedAdjusterID:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
java.lang.Long typeassignedAdjusterID75 = tebece0.getAssignedAdjusterID();
        String tempResultassignedAdjusterID75 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeassignedAdjusterID75));
        %>
        <%= tempResultassignedAdjusterID75 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lossInfo:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">lossDescription:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.LossInfoType tebece1=tebece0.getLossInfo();
if(tebece1 != null){
java.lang.String typelossDescription79 = tebece1.getLossDescription();
        String tempResultlossDescription79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelossDescription79));
        %>
        <%= tempResultlossDescription79 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">reportedDate:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.LossInfoType tebece1=tebece0.getLossInfo();
if(tebece1 != null){
java.util.Calendar typereportedDate81 = tebece1.getReportedDate();
        java.text.DateFormat dateFormatreportedDate81 = java.text.DateFormat.getDateInstance();
        java.util.Date datereportedDate81 = typereportedDate81.getTime();
        String tempResultreportedDate81 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatreportedDate81.format(datereportedDate81));
        %>
        <%= tempResultreportedDate81 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">causeOfLoss:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.LossInfoType tebece1=tebece0.getLossInfo();
if(tebece1 != null){
java.lang.String typecauseOfLoss83 = tebece1.getCauseOfLoss();
        String tempResultcauseOfLoss83 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecauseOfLoss83));
        %>
        <%= tempResultcauseOfLoss83 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">vehicles:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
com.mitchell.www.examples.claim.VehicleInfoType[] typevehicles85 = tebece0.getVehicles();
        String tempvehicles85 = null;
        if(typevehicles85 != null){
        java.util.List listvehicles85= java.util.Arrays.asList(typevehicles85);
        tempvehicles85 = listvehicles85.toString();
        }
        %>
        <%=tempvehicles85%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lossDate:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
java.util.Calendar typelossDate87 = tebece0.getLossDate();
        java.text.DateFormat dateFormatlossDate87 = java.text.DateFormat.getDateInstance();
        java.util.Date datelossDate87 = typelossDate87.getTime();
        String tempResultlossDate87 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatlossDate87.format(datelossDate87));
        %>
        <%= tempResultlossDate87 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claimantLastName:</TD>
<TD>
<%
if(createClaim64mtemp != null){
com.mitchell.www.examples.claim.MitchellClaimType tebece0=createClaim64mtemp.getClaimCreatedResponse();
if(tebece0 != null){
java.lang.String typeclaimantLastName89 = tebece0.getClaimantLastName();
        String tempResultclaimantLastName89 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaimantLastName89));
        %>
        <%= tempResultclaimantLastName89 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>