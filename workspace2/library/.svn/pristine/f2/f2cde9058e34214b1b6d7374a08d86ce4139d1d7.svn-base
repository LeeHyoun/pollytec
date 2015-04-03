<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<link rel="stylesheet" href="./css/sun/managermain.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<script type="text/javascript">
	function search(){
		var name = document.getElementById("usrName").value;
		
		window.open("rentUsr?usrName="+name,"rentu", "width=550px, height=500px,scrollbars=no,left=200,top=100;");
		popup.focus();
	 	var frm = document.form.frm;
	    frm.method = "POST";
	    frm.target = "rentu";
	    frm.action = "rentUsr";
	    frm.submit(); 
	}
	
	function Open(){ 
		opener.parent.location='rentlist'; 
		window.close(); 
	} 
</script>

<script type="text/javascript">
	 function getbook(){
		 alert("도서찾기");
			var bookIsbn = document.getElementById("bookIsbn").value; 
			//alert(bookIsbn);
			//alert($("#bookIsbn").val());
			if(bookIsbn.length == 13){
				// /board/replyWrite 에 post방식으로 전달.
				// alert(content + "," + boardSeq);
				$.ajax({
					  type: "POST",
					  url: 'getBook',
					  dataType: 'json',
					  data: {'bookIsbn':bookIsbn },
					  success: function(data){
						//alert(data.bookNo);
						$("#bookNo").val(data.bookNo);
						$("#bookTitle").val(data.bookTitle);
						$("#bookWriter").val(data.bookWriter);
						if(data.genreCode == "1"){
							$("#genreCode").val('소설');
						}else if(data.genreCode == "2"){
							$("#genreCode").val('교육');
						}else if(data.genreCode == "3"){
							$("#genreCode").val('참고서');
						}else if(data.genreCode == "4"){
							$("#genreCode").val('잡지');
						}else if(data.genreCode == "5"){
							$("#genreCode").val('컴퓨터');
						}
						$("#bookCompany").val(data.bookCompany);
						$("#bookCallnumber").val(data.bookCallnumber);
					  },
					});
			}else{
				alert('ISBN 입력이 잘못되었습니다.(13 자리 입니다.)');
			}
	}
	 
</script>
</head>
 <body>
 		
 		<div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-7"> <h1 class="text-center">도서 대여</h1> </div>
                </div> <br>
                <div class="row">
                    <div class="col-md-7 text-right">
                        <form name="frm" class="form-horizontal text-center" role="form" method="post" action="rentInsert">
                        	<div class="form-group has-feedback hidden-md">
                                <div class="col-sm-2">
                                    <label for="inputEmail3" class="control-label">회원이름</label>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" id="usrName" name="usrName" value="${usrName }">
                                </div>
                                <button type="button" class="btn btn-default" onclick="search()">검색</button>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputPassword3"  class="control-label" >연 &nbsp;락 &nbsp;처&nbsp;</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="usrMobile" name="usrMobile" value="${usrMobile }">
                                    
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputEmail3"  class="control-label">주 &nbsp; &nbsp; &nbsp; &nbsp;소</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="usrAddr1" name="usrAddr1" value="${usrAddr1 }">
                                    <input id="usrAddr2" name="usrAddr2" value="${usrAddr2 }">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputEmail3" class="control-label">이 메 일&nbsp;</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="usrEmail" name="usrEmail" value="${usrEmail }">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputEmail3" class="control-label">생년월일</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="usrBirth" name="usrBirth" value="${usrBirth }">
                                </div>
                            </div>
                           	<br><br>
<!-- ######################################################################################################## -->
                            <div class="form-group has-feedback hidden-md">
                                <div class="col-sm-2">
                                    <label >I S B N</label>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" id="bookIsbn" name="bookIsbn" >
                                </div>
                                <input type="button" class="btn btn-default" onclick="getbook()" value="검색">
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputPassword3" class="control-label">제 &nbsp; &nbsp; &nbsp;목</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="bookTitle" name="bookTitle">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputPassword3" class="control-label">저 &nbsp; &nbsp; &nbsp;자</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="bookWriter" name="bookWriter">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputPassword3" class="control-label">장 &nbsp; &nbsp; 르</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="genreCode" name="genreCode">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputPassword3" class="control-label">출 판 사</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="bookCompany" name="bookCompany">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2">
                                    <label for="inputPassword3" class="control-label">창구번호</label>
                                </div>
                                <div class="col-sm-6">
                                    <input id="bookCallnumber" name="bookCallnumber">
                                </div>
                            </div>
                            
                            <input type="hidden" id="usrId" name="usrId" value="${usrId }">
	                        <input type="hidden" id="bookNo" name="bookNo" >
	                        <button type="submit" class="btn btn-default" onclick="Open();">대여완료</button>&nbsp;
	                        <button type="button" class="btn btn-default" onclick="window.close();">취소</button>
                        </form>
                       
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
