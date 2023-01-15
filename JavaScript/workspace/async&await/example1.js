const articles = [
      {title:'First article'},
      {title:'Second article'}
   ];
   function getArticles(){
      setTimeout(()=>{
         let articleContent='';
         articles.forEach((article,index)=>{
            articleContent+=`${article.title}`+` `;
         });
         console.log(articleContent);
      },1000);
   }
   function createArticle(article){
      articles.push(article);
   }
   async function testAsync(){
      
      await createArticle({title:'Third article'});
      getArticles();
   }


   testAsync();
