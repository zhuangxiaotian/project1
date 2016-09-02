 function submitForm(submitUrl) 
{ 
	targetForm = document.forms[0]; 
	targetForm.action = submitUrl; 
	targetForm.submit(); 
} 

function trim(str){  
 return str.replace(/(^\s*)|(\s*$)/g, "");
}
function ltrim(str){ 
 return str.replace(/(^\s*)/g,"");
}
function rtrim(str){  
 return str.replace(/(\s*$)/g,"");
}
