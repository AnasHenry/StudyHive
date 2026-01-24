# ⚛️ React Interview Questions & Answers

---

## 1️⃣ React Basics

### Q1. What is React?
**Answer:**  
React is a JavaScript library for building fast and interactive user interfaces using a component-based architecture and a virtual DOM.

---

### Q2. Why use React?
**Answer:**
- Component reusability
- Virtual DOM for performance
- Declarative UI
- Strong ecosystem
- One-way data flow

---

### Q3. What is Virtual DOM?
**Answer:**  
The Virtual DOM is an in-memory representation of the real DOM. React updates the Virtual DOM first, compares changes (diffing), and updates only the required parts of the real DOM.

---

## 2️⃣ Components & JSX

### Q4. What is a component?
**Answer:**  
A component is an independent, reusable piece of UI.  
Types:
- Functional Components
- Class Components (legacy)

---

### Q5. What is JSX?
**Answer:**  
JSX is a syntax extension that allows writing HTML-like code inside JavaScript.

```jsx
const element = <h1>Hello World</h1>;

```
---

### Q6. Can browsers understand JSX?
**Answer:** 
No. JSX is transpiled to JavaScript using Babel.

---

## 3️⃣ Props & State

### Q7. What are props?
**Answer:** 
Props are read-only inputs passed from parent to child components.
```jsx
<Component name="React" />

```

---

### Q8. What is state?
**Answer:** 
State is a mutable object that stores component-specific data and triggers re-render when updated.

---

### Q9. Differennce between state and props.
**Answer:**
| Props              |          State           |
| ------------------ | :----------------------: |
| Immutable          |         Mutable          |
| Passed from parent | Managed inside component |
| Read-only          |      Can be updated      |


---

## 4️⃣ Hooks

### Q10. What are Hooks?
**Answer:** 
Hooks allow using state and lifecycle features in functional components.

---

### Q11. What is useState?
**Answer:** 
Used to manage state in functional components.
```jsx
const [count, setCount] = useState(0);
```

---

### Q12. What is useEffect?
**Answer:**
Used to handle side effects like API calls, subscriptions, timers, etc.
```jsx
useEffect(() => {
console.log("Component mounted");
}, []);
```

---


