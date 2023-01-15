let set1=new Set([1,2,3,4]);
let set2= new Set([3,4,5,6]);

//[1,2,3,4,5,6]  final set

let finalset=union(set1,set2);
console.log(finalset);

function union(firstset,secondset){

    var unionset=new Set(firstset);

    for(var element of secondset){

        unionset.add(element);
    }
return unionset;

}

let finalintersectset=intersect(set1,set2);

console.log(finalintersectset);

function intersect(firstset,secondset){

    var intersectSet= new Set();

    for(var element of secondset){

        if(firstset.has(element)){

            intersectSet.add(element);
        }
    }
return intersectSet;
}



