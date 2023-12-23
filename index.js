let count = 0;
const arr = [
    {
        first: [1, 2, 3],
    },
    {
        first: [4, 5, 6]
    },
    {
        first: [7, 8, 9, 10]
    }
]

arr.forEach((e, ind) => {
    // console.log('parent index' + ind);
    e.first.forEach((e, ind) => {
        count++;

        console.log('child index' + count);

    })
})