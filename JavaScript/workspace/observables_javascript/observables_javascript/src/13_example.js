import { filter } from 'rxjs/operators';
import {from} from 'rxjs';


const source=from([1,2,3,4,5,6,7,8]);

  const output= source.pipe(filter(x=>x%2===1));

  //output.subscribe(value=>console.log('${value}'))
  output.subscribe(value=>console.log(value));