(ns functional-programming-visualgo-fp.bst
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            [functional-programming-visualgo-fp.graphviz :as graphviz]
            [functional-programming-visualgo-fp.panel :as panel]))


;; 参考D3.js的领域描述来设计你的公共函数库,你的TODO

(defn select-all-path
  "TODO: 查找特定的一些边,然后改变他们的颜色"
  [])

(defn select-all-circle
  "TODO: 查找特定的一些圆圈,然后改变他们的颜色"
  [])

(defn append-path-circle
  "TODO: 在特定的边后面,加上圆圈"
  [])

(defn append-circle-path
  "TODO: 在特定的圆圈后面,加上边"
  [])

(defn update-circle-text
  "TODO: 修改圆圈内部的text内容"
  [text text2])

(defn generate-rand-tree []
  [:div.flex.flex-row.pa3
   [:div.flex.flex-auto]
   [:div
    [:button.f5.ba.bg-white
     {:on-click #(graphviz/d3-graphviz "#graph" "digraph  {a -> d; a -> c; c -> d}")
      :style {:border-radius "1em"
              :height "2em"
              :color "gray"
              :border "2px solid rgba(187, 187, 187, 1)"
              :width "7em"}}
     "生成随机树"]]])

(defn page []
  (reagent/with-let [left-menu (reagent/atom "close")]
    [:div
     [panel/header {:title "二叉搜索树"}]
     (if (= @left-menu "open")
       ;; 用绝对定位来漂浮一个菜单或者弹窗
       [:div.absolute.bottom-0.bg-yellow.mb5
        {:style {:margin-left "2.1em"
                 :height "11em"} }
        [:div.flex.flex-column
         [:div.pa2 "创建"]
         [:div.pa2 "搜索"]
         [:div.pa2 "插入"]
         [:div.pa2 "移除"]
         [:div.pa2 "中序遍历"]]]
       [:nobr])
     [:div.flex.flex-row {:style {:height "90vh"}}
      ;; 左边菜单栏
      [:div.flex.flex-column.h-100.bg-black
       {:style {:width "2em"}}
       [:div.flex.flex-auto {:style {:height "60vh"}}]
       [:div.bg-yellow {:style {:height "12.4em"}
                        :on-click #(if (= @left-menu "close")
                                     (reset! left-menu "open")
                                     (reset! left-menu "close"))}
        [:div.pt5 [:img {:src
                         (if (= @left-menu "close")
                           "/img/openRightMini.svg"
                           "/img/openLeftMini.svg")}]]]
       [:div.bg-black {:style {:height "10vh"}}]]
      ;; TODO: svg高度限制不了的问题,外面的盒子高度限制不管用, 但是宽度是能flex的
      [:div.flex.flex-auto.justify-center.items-center.mt3.mb3
       {:style {:height "80vh"}
        :id "graph"}]
      ;; 右边菜单栏
      [:div.bg-black {:style {:width "2em"}}]]
     ;; 底部菜单栏
     [:div.absolute.bottom-0.flex.flex-row.w-100.bg-black
      {:style {:height "2em"}}
      [:div]]]))
