
setInterval(() => {
    date = new Date();
    hr = date.getHours();
    min = date.getMinutes();
    sec = date.getSeconds();
    hrot = hr * 30 + min / 2;
    minrot = min * 6;
    secrot = sec * 6;

    hour.style.transform = `rotate(${hrot}deg)`;
    minute.style.transform = `rotate(${minrot}deg)`;
    second.style.transform = `rotate(${secrot}deg)`;
}, 1000);