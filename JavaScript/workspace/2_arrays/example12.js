
var mdits,len,x;
mdits=["car","bus","byke"];
len=mdits.length;
x="<ul>";
for (i=0; i<len;i++){
    x+="<li>"+mdits[i]+"</li>";
}
x+="</ul>"
document.getElementById("demo").innerHTML=x;