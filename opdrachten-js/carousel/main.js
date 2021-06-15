const prevBtn = document.querySelector("div.prev-arrow");
const nextBtn = document.querySelector("div.next-arrow");
const sectionContainer = document.querySelector("div.carousel-sections");

prevBtn.onclick = prev;
nextBtn.onclick = next;

let currentIndex = 0;
let slides = [];

function render() {

   let offset = 0;

   slides.forEach((slide, index) => {
      if (index < currentIndex) {
         offset += slide.offsetWidth;
      }
   });

   sectionContainer.style.transform = `translateX(-${offset}px)`;

}

function prev() {
   if (currentIndex < 0)
      return;
   currentIndex -= 1;
   render();
}

function next() {
   if (currentIndex === slides.length - 1)
      return;
   currentIndex += 1;
   render();
}

function init() {
   slides = document.querySelectorAll("div.carousel-sections > div");
   render();
}

init();
