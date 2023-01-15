import { Observable } from 'rxjs';
import { filter } from 'rxjs/operators';
const observable = new Observable(subscriber => {
  subscriber.next(1);
  subscriber.next(2);
  subscriber.next(3);
  subscriber.next(4);
  subscriber.next(5);
  subscriber.next(6);
  subscriber.next(7);
  setTimeout(() => {
    subscriber.next(4);
    subscriber.complete();
    //subscriber.next(5);
  }, 2000);
  
});
observable.subscribe(v => {
  
  console.log(filter(v=>(v%2==1)))
});