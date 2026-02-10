# 𝐍 NEXT.JS NOTES

---

## Next.js Introduction

### What is Next.js?
**Answer:**
Next.js is a React framework designed for better performance than React.js.

---

### What are the pros of using Next.js?
**Answer:**
- Routing
- API Routes
- Rendering
- Data Fetching
- Styling
- Optimization
- Dev and prod build System - Both client side and server side rendering made easy.
  
---

### Command to initialize a next.js application
**Answer:**
```bash
npx create-next-app@latest
```

---

### React Server Components (RSC)
**Answer:**
React Server Components is a new architecture that was introduced by the React team and quickly adopted by Next.js. This architecture introduces a new approach to creating React components by dividing them into two types:
- Server components:
    - By default, Next.js treats all components as Server components.
    - These components can perform server-side tasks like reading files or fetching data directly from a database.
    - However they can't use any hooks or monitor user interactions.
- Client components
    - To create a Client component, you'll need to add the "use client" directive at the top of your component file.
    - While Client components can't perform server-side tasks like reading files, they can use hooks and handle user interactions.
    - Client components are the traditional React Components.

---

### Routing
**Answer:**
- Next.js has a file-system routing system.
- URLs you can access in your browser are determined by how you organize your files and folders in your code.

---

### Routing Conventions
**Answer:**
- All routes must live inside the app folder
- Route files must be named either page.js or page.tsx
- Each folder represents a segment of the URL path

---

### Dynamic Routes.
**Answer:**
- Dynamic Routes are created by giving [PLACEHOLDER] as the folder name.