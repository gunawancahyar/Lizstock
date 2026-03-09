// Fungsi untuk handle klik tombol program
function orderProgram(namaProgram) {
    alert("Terima kasih telah memilih Program " + namaProgram + ".\nAnda akan diarahkan ke WhatsApp admin.");
    
    // Contoh redirect ke WA
    const phone = "6285155119338";
    const message = encodeURIComponent("Halo Lizstock, saya tertarik daftar Program " + namaProgram);
    window.location.href = `https://wa.me/${phone}?text=${message}`;
}

// Animasi Scroll Halus
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});
