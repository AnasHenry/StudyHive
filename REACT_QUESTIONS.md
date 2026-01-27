# ⚛️ React Interview Questions & Answers

---

## 1️⃣ React Basics

### Q1. What is React?
**Answer:**  
React is a JavaScript library for building fast and interactive user interfaces using a component-based architecture and a virtual DOM.

---

### Q2. Why use React / Advantages of using React?
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
The useState() is a built-in React Hook that allows you for having state variables in functional components. It should be used when the DOM has something that is dynamically manipulating/controlling.
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

### Q13. Dependency array in useEffect?
**Answer:**
It controls when the effect runs:
* No array -> every render
* Empty array -> once on mount
* With values -> when value change
  
---

### Q14. What is cleanup in useEffect?
**Answer:**
Used to remove subscriptions or listeners to avoid memory leaks.
```jsx
useEffect(() => {
  return () => cleanup();
}, []);
```

---

## 5️⃣ Lifecycle & Rendering

### Q15. When does React re-render?
**Answer:**
React re-renders when:
* State changes
* Props change
* Parent component re-renders
  
---

### Q16. What is reconciliation?
**Answer:**
The process where React compares old and new Virtual DOM trees to update the real DOM efficiently.

---

## 6️⃣ Performance Optimization

### Q17. What is React.memo?
**Answer:**
Prevents unnecessary re-renders by memoizing a component.

---

### Q18. What is UseMemo()?
**Answer:**
Memoizes expensive calculations so that it doesn't have to calculated again for each render.

---

### Q19. What is useCallback?
**Answer:**
Memoizes functions to prevent re-creation on every render.

---

## 7️⃣ Advanced Concepts

### Q20. What is Context API?
**Answer:**
Used to avoid prop drilling by sharing data globally.

---

### Q21. What is prop drilling?
**Answer:**
Passing props through multiple levels unnecessarily between components.

---

### Q22. Controlled vs Uncontrolled Components?
**Answer:**
| Controlled           |    Uncontrolled    |
| -------------------- | :----------------: |
| React controls state | DOM controls state |
| Uses useState        |      Uses ref      |

---

### Q23. What are keys in React?
**Answer:**
A key is a special string attribute that needs to be included when using lists of elements.
```jsx
const ids = [1,2,3,4,5];
const listElements = ids.map((id)=>{
return(
<li key={id.toString()}>
  {id}
</li>
)
})
```
Importance of Keys:
* Keys help react identify which elements were added, changed or removed.
* Keys should be given to array elements for providing a unique identity for each element.
* Without keys, React does not understand the order or uniqueness of each element.
* With keys, React has an idea of which particular element was deleted, edited, and added.
* Keys are generally used for displaying a list of data coming from an API.
---

## 8️⃣ Common Interview Scenarios

### Q24. Why shouldn’t we manipulate the DOM directly in React?
**Answer:**
Direct DOM manipulation bypasses React’s Virtual DOM and can cause UI inconsistencies.

---

### Q25. How to prevent infinite loops in useEffect?
**Answer:**
* Use proper dependency array
* Avoid updating dependent state inside the effect unnecessarily
  
---

### Q26. What is lifting state up?
**Answer:**
Moving shared state to the closest common parent to synchronize child components.

---

### Q27. What are the limitations of React?
**Answer:**
* React is not a full-blown framework as it is only a library.
* The components of React are numerous and will take time to fully grasp the benefits of all.
* Coding might become complex as it will make use of inline templating and JSX.
  
---

### Q28. 




