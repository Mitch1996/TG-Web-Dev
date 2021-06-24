let container = document.getElementById("container")

let index = 0
let points = 0

let div = document.createElement('div');
let next = document.createElement('div');

let startbtn = document.createElement("button")
container.appendChild(startbtn)
startbtn.id = "startbtn"
startbtn.innerText = "Start"

buttonHandler()

function randomizer(min, num) {
   return Math.floor(Math.random() * (num - min) + min)
}

function vraag() {
  return randomizer(1, 100) + " +  " + randomizer(1, 100)
}

function sum(param) {
   return eval(param)
}

let arr = []
let arr2 = []

function render() {
   let vragen = vraag()
   let sums = sum(vragen)
   arr.push(sums)
   arr2.push(vragen)
   switch (index++) {
      case 1: {
         index = 1
         creatediv(
            'new-rect',
            "Math problem 1",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
            "scorehandler",
            points + " " + "/ 7");
         break;
      }
      case 2:
         index = 2
         creatediv(
            'new-rect',
            "Math problem 2",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
            "scorehandler",
            points + " " + "/ 7");
         break;
      case 3: {
         index = 3
         creatediv(
            'new-rect',
            "Math problem 3",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
            "scorehandler",
            points + " " + "/ 7");
         break;
      }
      case 4: {
         index = 4
         creatediv(
            'new-rect',
            "Math problem 4",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
            "scorehandler",
            points + " " + "/ 7");
         break;
      }
      case 5: {
         index = 5
         creatediv(
            'new-rect',
            "Math problem 4",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
            "scorehandler",
            points + " " + "/ 7");
         break;
      }
      case 6: {
         index = 6
         creatediv(
            'new-rect',
            "Math problem 4",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
            "scorehandler",
            points + " " + "/ 7");
         break;
      }
      case 7: {
         index = 7
         creatediv(
            'new-rect',
            "Math problem 4",
            arr2[index],
            "question1",
            "ball",
            "1",
            "awnser1",
            randomizer(1, 100),
            "ball2",
            "2",
            "awnser1",
            arr[index],
            index + " " + "/ 7",
         "scorehandler",
         points + " " + "/ 7"
         )
         break;
      }
   }
}

   startbtn.onclick = render

   function creatediv(main, problem, test, question, ball, inner, answer1, btn1, ball2, inner2, answer2, btn2, progress, scorec, score) {
      div.id = main
      div.appendChild(document.createTextNode(progress))
      scoreHandler(scorec, score)
      h1Handler(problem)
      questionHandler(question, test)
      ballHandler(ball, inner)
      answerHandler(answer1, btn1)
      ballHandler(ball2, inner2)
      answerHandler(answer2, btn2)
      container.appendChild(div)
   }

   function h1Handler(param) {
      let h1Handler = document.createElement("H1")
      div.appendChild(h1Handler)
      h1Handler.innerHTML = param
   }


function answerHandler(param, inner) {
   let answer = document.createElement("button")
   div.appendChild(answer)
   answer.className = param
   answer.innerText = inner
   answer.style.pointerEvents = "auto"
   answer.onclick = function () {
      if(arr[index] == answer.innerHTML) {
         answer.style.background = "green"
         points++
         setTimeout(() => {
            index++
            div.innerHTML = ""
            render() }, 1000);
      } else {
         answer.style.background = "red"
         setTimeout(() => {
            answer.style.background = "white"
            index++
            div.innerHTML = ""
            render()
         }, 1000);
      }
   }
   answer.className = "answerButton"
}

   function questionHandler(param1, param2) {
      let questions = document.createElement("P")
      div.appendChild(questions)
      questions.className = param1
      questions.innerHTML = param2
   }

   function ballHandler(param1, ball) {
      let each = document.createElement("P")
      div.appendChild(each)
      each.className = param1
      each.innerHTML = ball
   }

   function scoreHandler(param, param2) {
      let scoren = document.createElement("P")
      div.appendChild(scoren)
      scoren.className = param
      scoren.innerHTML = param2
   }


   function buttonHandler() {
      let previous = document.createElement("button")
      next.appendChild(previous)
      previous.id = "nextbutton"
      previous.innerText = "Vorige"
      previous.onclick = function () {
         index--
         if (index < 1) {
            alert("Je kan niet terug vanaf het begin punt")
            return
         }
         div.innerHTML = ""
         render()
      }
      let nextstep = document.createElement("button")
      next.appendChild(nextstep)
      nextstep.id = "nextbutton2"
      nextstep.innerText = "Volgende"
      nextstep.onclick = function () {
         index++
         if (index > 7) {
            index = 1
         }
         div.innerHTML = ""
         render()
      }
      container.appendChild(next)
}

