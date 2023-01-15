import { interval } from 'rxjs';
import { take } from 'rxjs/operators';

const numbers = interval(3000);
const takeTen = numbers.pipe(take(10));

takeTen.subscribe(value => console.log("Subscriber: " + value));