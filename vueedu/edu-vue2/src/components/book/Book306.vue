<script setup>
import { ref } from 'vue';
import Book306Child from '@/components/book/Book306Child.vue';
const componentRef = ref(null); //반응성 데이터를 위한 초기화
setTimeout(() => {
  console.log(componentRef.value.number); // RefEx2Child 컴포넌트 인스턴스에 접근
  console.log(componentRef.value.doubleNumber); // RefEx2Child 컴포넌트 인스턴스에 접근
}, 10000);
</script>
<template>
  <h3>306p-자식 컴포넌트의 인스턴스 접근</h3>
  <Book306Child ref="componentRef" />
</template>
