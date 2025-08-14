
document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('loginForm');
  const email = document.getElementById('email');
  const password = document.getElementById('password');
  const emailError = document.getElementById('emailError');
  const passwordError = document.getElementById('passwordError');

  function show(el, msg) {
    el.textContent = msg;
    el.style.visibility = msg ? 'visible' : 'hidden';
  }

  function validateEmail() {
    const v = email.value.trim();
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!v) { show(emailError, 'Email cannot be empty'); return false; }
    if (!re.test(v)) { show(emailError, 'Invalid email format'); return false; }
    show(emailError, ''); return true;
  }

  function validatePassword() {
    const v = password.value.trim();
    if (!v) { show(passwordError, 'Password cannot be empty'); return false; }
    show(passwordError, ''); return true;
  }

  email.addEventListener('blur', validateEmail);
  password.addEventListener('blur', validatePassword);

  form.addEventListener('submit', (e) => {
    e.preventDefault(); // stop page reload
    const okEmail = validateEmail();
    const okPass = validatePassword();
    if (okEmail && okPass) {
      alert('Login successful!');
      // form.submit(); // <- use this if you actually want to submit
    }
  });
});

