
import { Observable } from 'rxjs';
let observable = new Observable((observer) => {
    observer.next(Math.random())
  })
  
  observable.subscribe(value => console.log(value))
  observable.subscribe(value => console.log(value))