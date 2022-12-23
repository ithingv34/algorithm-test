const { getFilesOf } = require('./util.js');

module.exports = {
  base: '/algorithm-test/',
  assetsPublicPath: '/',
  title: "CodingTest",
  plugins: ['@vuepress/last-updated'],
  themeConfig: {
    nav: [
      { text: 'Home', link: '/' }
    ],
    sidebar: [
      ['/', 'CodingTest'],
      {
        title: '재귀',
        path: '/src/recursive/',
        children: getFilesOf('src/recursive'),
      },
      {
        title: '탐색 (BFS/DFS)',
        path: '/src/search/',
        children: getFilesOf('src/search'),
      },
      {
        title: '다이나믹 프로그래밍',
        path: '/src/dp/',
        children: getFilesOf('src/dp'),
      },
      {
        title: '최단경로',
        path: '/src/shortest_path/',
        children: getFilesOf('src/shortest_path'),
      },
      {
        title: '그래프이론',
        path: '/src/graph/',
        children: getFilesOf('src/graph'),
      },
    ],
    repo: 'ithingv34/vuepress_template',
    repoLabel: 'GitHub',
    editLinks: true,
    docsBranch: 'master',
    editLinkText: 'Edit this page🙌!',
  },
};
