// /*let typeQuestion = 22

// console.log("this is a " + typeof typeQuestion + ", with the value: " + typeQuestion )

// let modulo = 24 % 10
// console.log(modulo)

// let division = 24 / 10
// console.log(division)

// let someNumber = "tekst"
// console.log(!someNumber)

// let someKittens = "De poes van de buurman heeft KITTENS gehad!"
// let someKitterns2 =  "Hij vraagt of wij nog kittens willen."

// console.log(someKittens.lastIndexOf("S") + someKittens.indexOf("K"))
// console.log(someKittens.indexOf("K"));
// console.log(" Lastindex = " + someKittens.lastIndexOf("S")  + " " + "Eerste index =" + someKittens.indexOf("K"))


// console.log(someKittens.slice(1, 10))
// console.log(someKittens.substr(1, 10))

// console.log(someKittens.slice(-1, -10))
// console.log(someKittens.substr(-1, -10))

// let someKittens3 = "Die nieuwe kittens zijn zo schattig!"

// console.log(someKittens3.split(" ") / 2)


// let x = 4;
// let y = 8;

// if(x == 4 && y == 8) {
//    console.log("Result!")
// }
// if(x == 4 || y == 8) {
//    console.log("Result!")
// }

// if(x != 3 || y != 6) {
//    console.log("geen result!")
// } else {
//    console.log("Result!")
// }

// if(x != 3 && y != 6) {
//    console.log("geen result!")
// } else {
//    console.log("Result!")
// }

// let nummer = 15;

// if(nummer >= 5 && nummer <= 10) {
//    console.log("Nummer")
// } else if(nummer >= 11 && nummer <= 20) {
//    console.log("Nummer2")
// } else if(nummer >= 21  && nummer <= 23) {
//    console.log("Nummer3")
// } else if(nummer <= 35 || nummer >= 40 && nummer <= 45) {
//    console.log("Nummer4")
// }

// let nummer2 = 10;

// if(nummer2 == 3) {
//    console.log("Nummer")
// } else if(nummer2 > 4) {
//    console.log("Nummer")
// } else if(nummer2 > 11) {
//    console.log("Nummer")
// } else if(nummer2 < 3) {
//    console.log("Nummer")
// }

// switch (new Date().getMonth()) {
//    case 0:
//       maand = "Februari";
//       break;
//    case 1:
//       maand = "Maart";
//       break;
//    case 2:
//       maand = "April";
//       break;
//    case 3:
//       maand = "Mei";
//       break;
//    case 4:
//       maand = "Juni";
//       break;
//    case 5:
//       maand = "Juli";
//       break;
//    case 6:
//       maand = "Augustus";
//       break;
//    case 7:
//       maand = "Juli";
//       break;
//    case 8:
//       maand = "September";
//       break;
//    case 9:
//       maand = "October";
//       break;
//    case 10:
//       maand = "November";
//       break;
//    case 11:
//       maand = "December";
//       break;

//    default : console.log("Geen geldige maand")
// }



// let naam = 5

// function naam2(verander) {
//       naam = verander
//    return verander * 2
// }

// console.log(naam2(10))*/

// function naam1(letter) { // 1
//    if(letter === "Mitch" ||letter === "Justin" || letter === "Leontine"  || letter === "Test"  ) {
//       console.log("De goeie naam!")
//    } else {
//       console.log("Die naam bestaat niet.")
//       return false
//    }
//    return letter;
// }

// function find(param) { // 2
//    if(param === "Mitch" ||param === "Justin" || param === "Leontine"  || param === "Test"  ) {
//       naam1(param)
//       document.getElementById("namen").innerHTML = param
//    }
//    return param;
// }

// window.onload = find("Mitch")


// let func = (letter2) => {
//    if(letter2 === "Mitch" || letter2 === "Justin" || letter2 === "Leontine"  || letter2 === "Test"  ) {
//       document.getElementById("namen2").innerHTML = letter2
//    } else {
//       console.log("Die naam bestaat niet.")
//    }
//    return letter2;
// }

// window.onload = func("Mitch")


// // let naamcheck = document.getElementById("namen")
// //
// // function naamChecker(naam) {
// //    switch (naam) {
// //       case "Mitch" :
// //       case "Manon" :
// //          console.log("naam gevonden")
// //          break;
// //       default:
// //          console.log("geen naam")
// //    }
// // }
// //
// // function naamPrint(param) {
// //    naamChecker(param)
// //    naamcheck.innerHTML += param
// //    return param;
// // }
// //
// // window.onload = naamPrint("Mitch")

// let getallen = [0 ,1, 2, 3, 5, 6, 7, 8, 9, 10]
// let fruit = ["Appelssss", "Aardbei", "banaan" , "peer"]

// let random = Math.floor(Math.random() * getallen.length)
// let radom2 = random % fruit.length

// let verander = fruit[0]  = fruit[3].splice

// let verander2 = [fruit[0], fruit[1]] = [fruit[1], fruit[0]];

// let temp = fruit[0];
// fruit[0] = fruit[1];
// fruit[1] = temp;


// console.log("fruit = " + " " + fruit[radom2])

// console.log("lengte" +  " " + fruit.length)

// console.log(verander)

// console.log(fruit)

// const dutchSpots = ["Voetbal", "Hockey", "Schaatsen"]

// for(i = 0; i < dutchSpots.length; i++) {
//    console.log(i)
// }

// // let test = [1, 3, 4, 5]
// //
// // for(nummer = 0; nummer <= test.length ; nummer++) {
// //    console.log(nummer)
// // }
// //
// // let nummer2 = 0
// //
// // while(nummer2 <= 9) {
// //    nummer2++
// //    console.log(nummer2)
// // }

// let fibo = [0, 1]

// for (let i = 2; i <= 10; i++) {
//    fibo[i] = fibo[i - 2] + fibo[i - 1];
//    console.log("Fibo " + fibo[i])
// }

// let numbers = [1, 3, 5, 4, 7, 2, 6, 9, 8]

// numbers.sort()

// console.log(numbers)




// Als je een lijst maakt van alle getallen onder de 10 die een meervoud zijn van 3 of 5 krijg je 3, 5, 6 en 9. De optelsom van deze getallen is 23.
// Geef de optelsom van alle getallen onder de 1000 die een meervoud van 3 of 5 zijn.


// for (let i = 1; i < 1000; i++) {
//     if (i % 3 === 0 || i % 5 === 0) {
//         console.log(i)
//     }

// }


/*
Misschien ben je al bekend met de Reeks van Fibonacci;
 een getallenreeks waarbij elk getal een optelsom van de vorige 2 is: 0,1, 1, 2, 3, 5, 8, 13 etc. Deze reeks heeft even en oneven getallen.
3
index.js:273 8
index.js:273 15
index.js:273 36
index.js:273 65

*/

// let fibo = [0, 1]
// let sum = 1
// for (let i = 2; i <= 100; i++) {
//     fibo[i] = fibo[i - 2] + fibo[i - 1];
//     if (fibo[i] % 2 !== 0 && fibo[i] <= 4000000) {
//         sum = fibo[i]
//         console.log(sum)
//     }


// }

// let fibo = [0, 1]
// let sum = 1
// for (let i = 2; i <= 100; i++) {
//     fibo[i] = fibo[i - 2] + fibo[i - 1];
//     if (fibo[i] % 2 != 0) {
//         sum += fibo[i]
//         if (sum < 4000000) {
//             y = sum
//         }
//     }
// }
// console.log(y)


function dateHandler(datum1, datum2) {
    let date1 = new Date(datum1)
    let date2 = new Date(datum2)
    let tijd = date2.getTime() - date1.getTime()
    let dag = tijd / (1000 * 3600 * 24);
    let round = Math.ceil(dag)
    return round
}


console.log(dateHandler("06/29/2021", "07/03/2021"))