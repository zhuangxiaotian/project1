	$(function() {
		$('.listexpander li ul').css({display:'none'});//初始化隐藏二级菜单
		$('.level1menu').click(function() {
			$(this).next().toggle();
			return false;
		});
		$('.childmenu').click(function() {
			$(".childmenu").each(function(i){
			   $(this)[0].style.backgroundPosition="left";
			 }); 
			this.style.backgroundPosition="right";
			return true;
		});
		/*$('.childmenu').dblclick(function() {
			this.style.backgroundPosition="left";
			return true;
		});*/
		var moveInterval = 100;
		var moveHeight = 20;
		var upInterval;
		$("#bottomUp").hover(function(){
			upInterval = window.setInterval(function(){
				var marginTop = $('.midbg').css('margin-top');
				marginTop = +marginTop.substring(0,marginTop.length - 2);
				if(marginTop < 0){
					marginTop += moveHeight;
					$('.midbg').css('margin-top',marginTop+'px');
				}else{
					clearInterval(upInterval);
				}
				refreshScorllButton();
			}, moveInterval);	
		},function(){
			clearInterval(upInterval);
		});
			
		var downInterval;
		$("#bottomDown").hover(function(){
			downInterval = window.setInterval(function(){
				var marginTop = $('.midbg').css('margin-top');
				marginTop = marginTop.substring(0,marginTop.length - 2);
				marginTop = +marginTop;
				var navHeight = $('#main_menu').height();
				var menuHeight = $('.listexpander').height();
				if(menuHeight + marginTop +30> navHeight){
					marginTop -= moveHeight;
					$('.midbg').css('margin-top',marginTop+'px');
				}else{
					clearInterval(downInterval);
				}
				refreshScorllButton();
			}, moveInterval);	
		},function(){
			clearInterval(downInterval);
		});
			
		
		$('.level1menu').click(function() {
			refreshScorllButton();
			return false;
		});
		
	});
	
	function refreshScorllButton(){
		var marginTop = $('.midbg').css('margin-top');
		marginTop = +marginTop.substring(0,marginTop.length - 2);
		var menuHeight=$('#main_menu').height();
		var menuInnerHeight=$('.listexpander').height();
		if(menuHeight<menuInnerHeight||marginTop<0){
			$('.main_nav').addClass('addLeftSideMargin');
			$('#bottomUp').show();
			$('#bottomDown').show();
		}
		else
		{
			$('.main_nav').removeClass('addLeftSideMargin');
			$('#bottomUp').hide();
			$('#bottomDown').hide();
		}
	}
	
	function resizecontrol()
	{
		var wrapper = $('#wrapper')[0];
		var rightmain= document.getElementById("main_content");
		var mainMenu= document.getElementById("main_menu");
		var header=document.getElementById("header");
		//var bluebar=document.getElementById("bluebar");
		var mainframe=document.getElementById("mainframe");
		//rightmain.style.width=document.body.offsetWidth-leftside.offsetWidth+"px";
		var footerHeight = 30;
		rightmain.style.height = document.body.offsetHeight-header.offsetHeight-footerHeight+"px";
		mainframe.style.height = rightmain.style.height;
		wrapper.style.width = document.body.offsetWidth + "px";
		rightmain.style.width = document.body.offsetWidth - mainMenu.offsetWidth-11+"px";
		//mainframe.style.width = rightmain.style.width;
		mainMenu.style.height = document.body.offsetHeight-header.offsetHeight-footerHeight+"px";	
		refreshScorllButton();
	}
