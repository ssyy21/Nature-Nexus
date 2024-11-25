// Google Sign In
document.querySelector(".google").addEventListener("click", () => {
    alert("Google Sign In function here");
  });
  
  // Facebook Sign In
  document.querySelector(".facebook").addEventListener("click", () => {
    alert("Facebook Sign In function here");
  });

document.querySelector('.signup-form form').addEventListener('submit', (e) => {
    e.preventDefault();
    const email = e.target.querySelector('input[type="email"]').value;
    const password = e.target.querySelector('input[type="password"]').value;
    const name = e.target.querySelector('input[type="text"]').value;

    // Save to local storage
    localStorage.setItem('user', JSON.stringify({ email, password, name }));
    alert('Signup successful! Data saved in local storage.');
});

document.querySelector('.login-form form').addEventListener('submit', (e) => {
    e.preventDefault();
    const email = e.target.querySelector('input[type="email"]').value;
    const password = e.target.querySelector('input[type="password"]').value;

    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.email === email && user.password === password) {
        alert('Login successful!');
    } else {
        alert('Invalid email or password.');
    }
});
