// 5. Create a quiz app

// a. create an array of objects, which will have questions and options
// b. load the question in para
// c. load the options as radio buttons
// d. have a submit button to submit the response and load next question

// const questions=[
//   {question:"Who is the PM of India",
//    option1:"Narendra Modi"
//    option2:"Amit Shah",
//   ..,
//   correctOption:2},
//   {
  
//   },
//   {
  
//   },
//   {
  
//   },
//   {
// ];

const quiz = document.querySelector(".quiz")
const Qquestion = document.querySelector(".Qquestion")
const button = document.querySelector(".submit")
const QuizOption1 = document.querySelector("#ans1")
const QuizOption2 = document.querySelector("#ans2")
const QuizAns = document.querySelectorAll(".option")

 let html = ``;

const questions=[
  {question:"Who is the PM of India",
   option1:"Narendra Modi",
   option2:"Amit Shah",

  correctOption:1},




  {question:"C++ is Object Oriented",
  option1:"True",
  option2:"False",

 correctOption:1},




 {question:"Multiple inheritence is supported in java",
 option1:"True",
 option2:"False",

correctOption:2}








]

let currentQuiz = 0
let score = 0


let QuizLength = questions.length;

console.log(QuizLength);

var userOptions=[]






loadQuiz ()
function loadQuiz() {



  deselectAnswers()

  
  const currentQuizdata = questions[currentQuiz]

  Qquestion.innerText = currentQuizdata.question

   QuizOption1.innerText =  currentQuizdata.option1
   QuizOption2.innerText =  currentQuizdata.option2



console.log(currentQuiz);

}


function deselectAnswers() {
  QuizAns.forEach(ans => ans.checked = false)
}



function getSelected() {
  let answer
  QuizAns.forEach(Option => {
      if(Option.checked) {
          answer = Option.value
      }
  })
  return answer
}








button.addEventListener('click', e=>{

    const answer = getSelected()

    console.log("option:"+answer);

    if(currentQuiz<QuizLength)
    { loadQuiz()}

    if(answer){
      if(answer == questions[currentQuiz].correctOption ){
        score++
      }

      currentQuiz++

      if (currentQuiz < QuizLength) {
        loadQuiz()
        
      }

      else{
        quiz.innerHTML = `You answered ${score}/${QuizLength} questions correctly`

    
      }

    }






})





// console.log(userOptions);
  
        
//     });















// <p class="question">######Q</p>

// Option 1 <input type="radio" name="option" value="1">
// Option 2 <input type="radio" name="option" value="2">
// <br>
// <input type="button" value="submit">
// </div>










