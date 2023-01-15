import { Observable } from 'rxjs';

const interval = new Observable(observer => {
  let count = 0;
  const interval = setInterval(() => {
    observer.next(count++);
  }, 1000);

  // once we stop listening to values clear the interval
  return () => {
    clearInterval(interval);
  };
});

interval.subscribe(value => console.log(value));

const subscription = interval.subscribe(value => console.log(value));
setTimeout(() => subscription.unsubscribe(), 3000);