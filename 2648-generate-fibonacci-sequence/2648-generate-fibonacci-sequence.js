/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a = 0, b = 1;

    while (true) {
        yield a;
        b += a;
        a = b - a;
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