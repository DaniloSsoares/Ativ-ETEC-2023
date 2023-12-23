function menuShow() {
    let menuMobile = document.querySelector('.mobile-menu');
    let icon = document.querySelector('.icon'); // Seleciona o elemento .icon
    
    if (menuMobile.classList.contains('open')) {
        menuMobile.classList.remove('open');
        icon.src = "img/menu_white_36dp.svg"; // Corrige o caminho da imagem
    } else {
        menuMobile.classList.add('open');
        icon.src = "img/close_white_36dp.svg"; // Corrige o caminho da imagem
    }
}