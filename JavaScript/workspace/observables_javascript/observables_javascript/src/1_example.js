import { Observable } from 'rxjs';

let observable = new Observable((observer) => {
  setTimeout(() => {
    observer.next("some value")
  }, 1000);
})

observable.subscribe(value => {
  
  console.log(value)
});