
import { Observable } from 'rxjs';
const output=new Observable(observer =>{
    setTimeout(()=> {
    observer.next('html');
    observer.next('css');
    observer.next('javascript');
    },1000);
});
output.subscribe(result=> {
    console.log('obseravble:',result);
})

