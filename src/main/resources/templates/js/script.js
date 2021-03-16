const slideList = [{
    img: "Images/australia.jpg",
    text: 'Australia'
    },
    {
        img: "Images/Azja.jpg" ,
        text: 'Azja'
    },
    {
        img: "Images/barcelona.jpg",
        text: 'Hiszpania'
    },
    {
        img: "Images/LA.jpg",
        text: 'Ameryka Północna'
    },
    {
        img: "Images/oceania.jpg",
        text: 'Oceania'
    },
    {
        img: "Images/paryz.jpg",
        text: 'Francja'
    },
    {
        img: "Images/rio.jpg",
        text: 'Ameryka Południowa'
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
