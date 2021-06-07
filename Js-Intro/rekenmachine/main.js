let knoppen = document.querySelectorAll('button')
let display = document.querySelector('.calculator-screen')

knoppen.forEach(function(button) {
   button.addEventListener('click', rekenUit);
});

function rekenUit(handle) {
   let knopValue = handle.target.value;
   if (knopValue === '=') {
      if (display.value !== '') {
         display.value = eval(display.value);
      }
   } else if (knopValue === 'all-clear') {
      display.value = '';
   } else {
      display.value += knopValue;
   }
}
