const slideList = [{
    img: "Images/australia.jpg",
    text: 'Australia'
    },
    {
        img: "Images/Azja.jpg" ,
    },
    {
        img: "Images/barcelona.jpg",
    },
    {
        img: "Images/LA.jpg",
    },
    {
        img: "Images/oceania.jpg",
    },
    {
        img: "Images/paryz.jpg",
    },
    {
        img: "Images/rio.jpg",
    }];

const image = document.querySelector('img.slider');
const h1 = document.querySelector('h1.slider');
const dots = [...document.querySelectorAll('.dots span')]
// Interfejs
const time = 4000;
let active = 0;

// Implementacje

const changeDot = () => {
    const activeDot = dots.findIndex(dot => dot.classList.contains('active'));
    dots[activeDot].classList.remove('active');
    dots[active].classList.add('active');
}

const changeSlide = () => {
    active++;
    if (active === slideList.length) {
        active = 0;
    }
    image.src = slideList[active].img;
    h1.textContent = slideList[active].text;
    changeDot()
}
setInterval(changeSlide, time)
