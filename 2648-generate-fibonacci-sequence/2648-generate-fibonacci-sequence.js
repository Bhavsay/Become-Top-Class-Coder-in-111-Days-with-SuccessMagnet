/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let curr = 0;
    let next = 1;

    while(true){
        yield curr;
        [next, curr] = [curr+next, next];
    }

};

/**

The above line id equivalent to the following:
let temp = curr;
curr = next;
next = temp + next;


 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */