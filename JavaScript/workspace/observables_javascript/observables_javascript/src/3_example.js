import { Observable } from 'rxjs';

let observable = new Observable((observer) => {
    console.log("observable is running")
    observer.next("a")
  })
  
  console.log("start")
  observable.subscribe(value => console.log(value))
  console.log("end")