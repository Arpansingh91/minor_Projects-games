const socket = io('http://localhost:8000', { transports: ['websocket'] })
const form = document.getElementById('sendMessage');
const messageinput = document.getElementById('msginp');
const msgcontainer = document.querySelector('.container');
var audio = new Audio('ting.mp3');
const append = (message, position) => {
    const messageElement = document.createElement('div');
    messageElement.innerText = message;
    messageElement.classList.add('message');
    messageElement.classList.add(position);
    msgcontainer.append(messageElement);
    if (position == 'left') {
        audio.play();
    }

}
form.addEventListener('submit', (e) => {
    e.preventDefault();
    const msg = messageinput.value;
    append(`You: ${msg}`, 'right');
    socket.emit('send', msg);
    messageinput.value = "";
});
const user = prompt('Enter your name to join');
socket.emit('new-user-joined', user);
socket.on('user-joined', user => {
    append(`${user} joined the chat`, 'right')
})
socket.on('receive', data => {
    append(`${data.user}: ${data.message}`, 'left');
});
socket.on('left', user => {
    append(`${user} left the chat`, 'left');
});