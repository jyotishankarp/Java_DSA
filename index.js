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

        // console.log('child index' + count);

    })
})

const person = {
    name: 'John',
    age: undefined,

    speak() {
        console.log(this.name);
    },
    talk: () => {
        console.log(this.name)
    }
}
person.speak();
person.talk();
// const person2 = JSON.parse(JSON.stringify(person));

// const person2 = { ...person }

// console.log(person2)