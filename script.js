// script.js

// Select elements
const navLinks = document.querySelectorAll('nav ul li a');
const heroButton = document.querySelector('.hero button');
const contactForm = document.querySelector('.contact-form');

// Add event listeners
navLinks.forEach(link => {
  link.addEventListener('click', () => {
    console.log('Navigation link clicked');
  });
});

heroButton.addEventListener('click', () => {
  console.log('Hero button clicked');
});

contactForm.addEventListener('submit', (e) => {
  e.preventDefault();
  console.log('Contact form submitted');
  // Add form submission logic here
});

// Add interactive functionality to the website
function changeHeroImage() {
  const heroImage = document.querySelector('.hero img');
  heroImage.src = 'images/hero-image-alt.jpg';
}

function showTeamMembers() {
  const teamMembers = document.querySelectorAll('.team div');
  teamMembers.forEach(member => {
    member.style.display = 'block';
  });
}

// Call the functions
changeHeroImage();
showTeamMembers();