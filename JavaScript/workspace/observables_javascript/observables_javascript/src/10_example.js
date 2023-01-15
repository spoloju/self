import { Observable } from 'rxjs';

const output = new Observable(observer => {
  let count = 0;
  const interval = setInterval(() => {
    observer.next(count++);
    //observer.complete();
  }, 100);

  // once we stop listening to values clear the interval
  return () => {

    clearInterval(2000);
  };
});

output.subscribe(value => console.log(value));