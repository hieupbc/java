$(document).ready(function() {

	$("#btnLogin").click(function(){
		var ten = $("#username").val();
		var password = $("#password").val();
		
		$.ajax({
			url:"/QLBCKHweb/api/loginControll",
		    type:"POST",
		    data:{
		    	username:ten,
		    	password:password
		    },
			success: function(value){
				if(value == "true"){
					alert('abc');
					duongDanHienTai = window.location.href;
					alert(duongDanHienTai);
					duongDan = duongDanHienTai.replace("login/","");
					alert(duongDan);
					window.location = duongDan;
					
				}else{
					$("#ketqua").text("dang nhap that bai !")
				}
				
			}
		})
		
		
	});

});