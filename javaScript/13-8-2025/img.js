document.addEventListener("DOMContentLoaded", () => {
  const images = [
    "https://m.media-amazon.com/images/I/81QVBFbg2qL.jpg",
    "https://images.lifestyleasia.com/wp-content/uploads/sites/3/2022/03/18132140/hero-image-mustang.jpg",
    "https://upload.wikimedia.org/wikipedia/commons/7/7f/1965_Ford_Mustang_2D_Hardtop_Front.jpg",
    "https://a57.foxnews.com/static.foxnews.com/foxnews.com/content/uploads/2018/09/1200/675/first-ford-mustang.jpg?ve=1&tl=1"
  ];

  let currentIndex = 0;
  const galleryImage = document.getElementById("galleryImage");
  const prevBtn = document.getElementById("prevBtn");
  const nextBtn = document.getElementById("nextBtn");

  // Show image at current index
  function showImage(index) {
    galleryImage.src = images[index];
  }

  // Next image
  nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
  });

  // Previous image
  prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
  });

  // Initialize
  showImage(currentIndex);
});
