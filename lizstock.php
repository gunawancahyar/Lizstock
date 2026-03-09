<?php
// Simulasi Data Testimonial dari Database
$testimonials = [
    [
        "nama" => "Andi Prasetyo",
        "role" => "Entrepreneur",
        "pesan" => "Dalam 3 bulan saya sudah bisa profit konsisten.",
        "return" => "+45% Portfolio"
    ],
    [
        "nama" => "Diana Kartika",
        "role" => "Professional",
        "pesan" => "Mindset investasi saya berubah total.",
        "return" => "+35% Portfolio"
    ]
];

// Fungsi untuk render bintang
function renderStars($rating) {
    return str_repeat("⭐", $rating);
}
?>
